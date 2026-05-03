package Controlador;

import Vista.FrmPrincipal;
import Modelo.Validaciones;
import Modelo.Cancion;
import Modelo.Playlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class ManagementPlayer implements ActionListener {

    private FrmPrincipal vista;
    private Playlist<Cancion> playlist;
    private Controlador controlador;
    private Timeline timeline;

    public ManagementPlayer(FrmPrincipal vista, Playlist<Cancion> playlist) {
        this.vista = vista;
        this.playlist = playlist;
        this.controlador = new Controlador(playlist);

        initBotones();
        initLista();
        initSlider();
        initProgressBar();

        cargarLista();
    }
    
    private void initLista() {
        vista.listPlaylists.addListSelectionListener(e -> onSeleccionCancion(e));
    }
    
    private void onSeleccionCancion(javax.swing.event.ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;

        Object obj = vista.listPlaylists.getSelectedValue();

        if (!(obj instanceof Cancion)) return;

        Cancion seleccionada = (Cancion) obj;

        controlador.reproducirDirecto(seleccionada);
        vista.lblSongTitle.setText(seleccionada.getTitulo());
    }
    
    private void initSlider() {
        vista.sliderProgress.setMinimum(0);
        vista.sliderProgress.setMaximum(100);
        vista.sliderProgress.setValue(0);

        vista.sliderProgress.addChangeListener(e -> onSliderChange());
    }
    
    private void onSliderChange() {

        if (!vista.sliderProgress.getValueIsAdjusting()) return;

        var player = controlador.getPlayer();

        if (!Validaciones.duracionValida(player)) return;

        double total = player.getTotalDuration().toSeconds();
        double porcentaje = vista.sliderProgress.getValue() / 100.0;

        player.seek(Duration.seconds(total * porcentaje));
    }
    
    private void initBotones() {
        vista.btnPlay.addActionListener(this);
        vista.btnNext.addActionListener(this);
        vista.btnPrev.addActionListener(this);
    }
    
    private void initProgressBar() {
        timeline = new Timeline(
            new KeyFrame(Duration.millis(300), e -> actualizarProgreso())
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    
    private void actualizarProgreso() {

        var player = controlador.getPlayer();

        if (!Validaciones.duracionValida(player)) return;

        double total = player.getTotalDuration().toSeconds();
        double actual = player.getCurrentTime().toSeconds();

        double progreso = (actual / total) * 100;

        vista.sliderProgress.setValue((int) progreso);
        vista.lblTimeStart.setText(Validaciones.formatTime(actual));
        vista.lblTimeEnd.setText(Validaciones.formatTime(total));
    }

    private void cargarLista() {

        DefaultListModel<Cancion> modelo = new DefaultListModel<>();

        // recorrer playlist
        var nodo = playlist.buscar(c -> true); // primer nodo

        if (nodo == null) return;

        var inicio = nodo;
        var aux = nodo;

        do {
            modelo.addElement(aux.getDato());
            aux = aux.getSig();
        } while (aux != inicio);

        vista.listPlaylists.setModel(modelo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnPlay) {
            controlador.playActual();
        }

        if (e.getSource() == vista.btnNext) {
            controlador.siguiente();
        }

        if (e.getSource() == vista.btnPrev) {
            controlador.anterior();
        }
    }
    
    private void initProgressTimeline() {
        timeline = new Timeline(
            new KeyFrame(Duration.millis(300), e -> {
                var player = controlador.getPlayer();
                if (Validaciones.duracionValida(player)) {
                    double total = player.getTotalDuration().toSeconds();
                    double actual = player.getCurrentTime().toSeconds();
                    double progreso = (actual / total) * 100;
                    vista.sliderProgress.setValue((int) progreso);
                    vista.lblTimeStart.setText(Validaciones.formatTime(actual));
                    vista.lblTimeEnd.setText(Validaciones.formatTime(total));
                }
            })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}