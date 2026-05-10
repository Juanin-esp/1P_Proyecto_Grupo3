package Controlador.reproductor;

import Modelo.servicios.ReproductorService;
import Vista.VistaReproductor;

public class GestorVolumen {

    private VistaReproductor vista;
    private ReproductorService controlador;

    public GestorVolumen(VistaReproductor vista,ReproductorService controlador) {
        this.vista = vista;
        this.controlador = controlador;
    }

    public void init() {
        vista.getSliderVolume().setMinimum(0);
        vista.getSliderVolume().setMaximum(100);
        vista.getSliderVolume().setValue((int)(controlador.getVolumenActual() * 100));
        vista.getSliderVolume().addChangeListener(e -> onVolumeChange());
    }

    private void onVolumeChange() {
        int valor = vista.getSliderVolume().getValue();
        double volumen = valor / 100.0;
        vista.getLblVolume().setText(valor + "");

        if (controlador.isMute() && volumen > 0) {
            controlador.desmutearDirecto(volumen);
        } else {
            controlador.setVolumen(volumen);
        }
        boolean mute = volumen == 0;
        vista.getBtnTogMute().setSelected(mute);
        vista.getBtnTogMute().setText(mute ? "🔇" : "🔊");
    }

    public void toggleMute() {
        boolean mute =vista.getBtnTogMute().isSelected();
        if (mute) {
            controlador.toggleMute();
            vista.getBtnTogMute().setText("🔇");
        } else {
            controlador.toggleMute();
            vista.getBtnTogMute().setText("🔊");
        }
        int valor = (int)(controlador.getVolumenActual() * 100);
        vista.getSliderVolume().setValue(valor);
    }
    
    public void sincronizarUI() {
        int valor = (int)(controlador.getVolumenActual() * 100);
        vista.getSliderVolume().setValue(valor);
        vista.getLblVolume().setText(valor + "");
        boolean mute = controlador.isMute();
        vista.getBtnTogMute().setSelected(mute);
        vista.getBtnTogMute().setText(mute ? "🔇" : "🔊");
    }
}