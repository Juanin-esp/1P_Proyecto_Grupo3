package Controlador;

import Vista.FrmPrincipal;
import Vista.SliderModerno;
import Modelo.Validaciones;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class ProgressManager {

    private FrmPrincipal vista;
    private Controlador controlador;
    private Timeline timeline;

    public ProgressManager(FrmPrincipal vista, Controlador controlador) {
        this.vista = vista;
        this.controlador = controlador;
    }

    public void initSliderGUI() {
        SliderModerno.aplicar(vista.sliderProgress, SliderModerno.Tipo.PROGRESO);
        SliderModerno.aplicar(vista.sliderVolume,   SliderModerno.Tipo.VOLUMEN);
    }

    public void initSlider() {
        vista.sliderProgress.setMinimum(0);
        vista.sliderProgress.setMaximum(100);
        vista.sliderProgress.setValue(0);
        vista.sliderProgress.addChangeListener(e -> onSliderChange());
    }

    public void initTimeline() {
        timeline = new Timeline(
            new KeyFrame(Duration.millis(300), e -> actualizarProgreso())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void onSliderChange() {
        if (!vista.sliderProgress.getValueIsAdjusting()) return;

        var player = controlador.getPlayer();
        if (!Validaciones.duracionValida(player)) return;

        double total = player.getTotalDuration().toSeconds();
        double porcentaje = vista.sliderProgress.getValue() / 100.0;
        player.seek(Duration.seconds(total * porcentaje));
    }

    private void actualizarProgreso() {
        var player = controlador.getPlayer();
        if (!Validaciones.duracionValida(player)) return;

        double total  = player.getTotalDuration().toSeconds();
        double actual = player.getCurrentTime().toSeconds();

        vista.sliderProgress.setValue((int)((actual / total) * 100));
        vista.lblTimeStart.setText(Validaciones.formatTime(actual));
        vista.lblTimeEnd.setText(Validaciones.formatTime(total));
    }
}