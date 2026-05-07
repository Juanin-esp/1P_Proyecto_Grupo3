package Controlador;

import Vista.FrmPrincipal;

public class VolumeManager {

    private FrmPrincipal vista;
    private Controlador controlador;

    public VolumeManager(FrmPrincipal vista, Controlador controlador) {
        this.vista = vista;
        this.controlador = controlador;
    }

    public void init() {
        vista.sliderVolume.setMinimum(0);
        vista.sliderVolume.setMaximum(100);
        vista.sliderVolume.setValue((int)(controlador.getVolumenActual() * 100));
        vista.sliderVolume.addChangeListener(e -> onVolumeChange());
    }

    private void onVolumeChange() {
        int valor = vista.sliderVolume.getValue();
        double volumen = valor / 100.0;
        vista.lblVolume.setText(valor + "");

        if (controlador.isMute() && volumen > 0) {
            controlador.desmutearDirecto(volumen);
        } else {
            controlador.setVolumen(volumen);
        }

        actualizarIcono();
    }

    public void toggleMute() {
        controlador.toggleMute();
        int valor = (int)(controlador.getVolumenActual() * 100);
        vista.sliderVolume.setValue(valor);
        actualizarIcono();
    }

    public void actualizarIcono() {
        if (controlador.isMute() || controlador.getVolumenActual() == 0) {
            vista.btnMute.setText("🔇");
        } else {
            vista.btnMute.setText("🔊");
        }
    }
}