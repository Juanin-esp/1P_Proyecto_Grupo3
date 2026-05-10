package Controlador.reproductor;

import Modelo.servicios.ReproductorService;
import Vista.SliderModerno;
import Modelo.Validaciones;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import Vista.VistaReproductor;

public class GestorProgreso {

    private VistaReproductor vista;
    private ReproductorService controlador;
    private Timeline timeline;

    public GestorProgreso(VistaReproductor vista, ReproductorService controlador) {
        this.vista = vista;
        this.controlador = controlador;
    }

    public void initSliderGUI() {
        SliderModerno.aplicar(vista.getSliderProgress(), SliderModerno.Tipo.PROGRESO);
        SliderModerno.aplicar(vista.getSliderVolume(),   SliderModerno.Tipo.VOLUMEN);
    }

    public void initSlider() {
        vista.getSliderProgress().setMinimum(0);
        vista.getSliderProgress().setMaximum(100);
        vista.getSliderProgress().setValue(0);
        vista.getSliderProgress().addChangeListener(e -> onSliderChange());
    }

    public void initTimeline() {
        timeline = new Timeline(
            new KeyFrame(Duration.millis(300), e -> actualizarProgreso())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void onSliderChange() {
        if (!vista.getSliderProgress().getValueIsAdjusting()) return;

        var player = controlador.getPlayer();
        if (!Validaciones.duracionValida(player)) return;

        double total = player.getTotalDuration().toSeconds();
        double porcentaje = vista.getSliderProgress().getValue() / 100.0;
        player.seek(Duration.seconds(total * porcentaje));
    }

    private void actualizarProgreso() {
        var player = controlador.getPlayer();
        if (!Validaciones.duracionValida(player)) return;

        double total  = player.getTotalDuration().toSeconds();
        double actual = player.getCurrentTime().toSeconds();

        vista.getSliderProgress().setValue((int)((actual / total) * 100));
        vista.getLblTimeStart().setText(Validaciones.formatTime(actual));
        vista.getLblTimeEnd().setText(Validaciones.formatTime(total));
    }
}