package Controlador;

import Vista.FrmPrincipal;
import Vista.SliderModerno;
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
        initSliderGUI();
        initSlider();
        initProgressBar();
        initVolume();

        cargarLista();
    }
    
    private void initBotones() {
        vista.btnPlay.addActionListener(this);
        vista.btnNext.addActionListener(this);
        vista.btnPrev.addActionListener(this);
        vista.btnMute.addActionListener(this);
        vista.btnPause.addActionListener(this);
        vista.btnPause.setVisible(false);
    }
    
    private void actualizarBotonesReproduccion(boolean reproduciendo) {
        vista.btnPlay.setVisible(!reproduciendo);
        vista.btnPause.setVisible(reproduciendo);
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
        actualizarBotonesReproduccion(true);
    }
    
    private void initSlider() {
        vista.sliderProgress.setMinimum(0);
        vista.sliderProgress.setMaximum(100);
        vista.sliderProgress.setValue(0);
        vista.sliderProgress.addChangeListener(e -> onSliderChange());
    }
    
    private void initSliderGUI() {
        SliderModerno.aplicar(vista.sliderProgress, SliderModerno.Tipo.PROGRESO);
        SliderModerno.aplicar(vista.sliderVolume,   SliderModerno.Tipo.VOLUMEN);
    }
    
    private void onSliderChange() {

        if (!vista.sliderProgress.getValueIsAdjusting()) return;

        var player = controlador.getPlayer();

        if (!Validaciones.duracionValida(player)) return;

        double total = player.getTotalDuration().toSeconds();
        double porcentaje = vista.sliderProgress.getValue() / 100.0;

        player.seek(Duration.seconds(total * porcentaje));
    }
    
    private void initProgressBar() {
        timeline = new Timeline(
            new KeyFrame(Duration.millis(300), e -> actualizarProgreso())
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    private void initVolume() {
        vista.sliderVolume.setMinimum(0);
        vista.sliderVolume.setMaximum(100);
        vista.sliderVolume.setValue((int)(controlador.getVolumenActual()*100));
        vista.sliderVolume.addChangeListener(e -> onVolumeChange());
    }
    
    private void onVolumeChange() {
        int valor = vista.sliderVolume.getValue();
        double volumen = valor / 100.0;
        vista.lblVolume.setText(valor+"");
        if (controlador.isMute() && volumen > 0) {
            controlador.desmutearDirecto(volumen);
        } else {
            controlador.setVolumen(volumen);
        }
        actualizarIconoVolumen();
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
    
    private void actualizarIconoVolumen() {
        if (controlador.isMute() || controlador.getVolumenActual() == 0) {
            //vista.btnMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mute.png")));
            vista.btnMute.setText("🔇");
        } else {
            //vista.btnMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/volume.png")));
            vista.btnMute.setText("🔊");
        }
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
            controlador.playOrResumeActual();
            actualizarBotonesReproduccion(true);
        }
        
        if (e.getSource() == vista.btnPause) {
            controlador.pause();
            actualizarBotonesReproduccion(false);
        }

        if (e.getSource() == vista.btnNext) {
            controlador.siguiente();
            actualizarBotonesReproduccion(true);
        }

        if (e.getSource() == vista.btnPrev) {
            controlador.anterior();
            actualizarBotonesReproduccion(true);
        }
        
        if (e.getSource() == vista.btnMute) {
            controlador.toggleMute();
            int valor = (int)(controlador.getVolumenActual() * 100);
            vista.sliderVolume.setValue(valor);
            actualizarIconoVolumen();
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