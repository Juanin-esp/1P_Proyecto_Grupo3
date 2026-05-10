package Controlador.app;

import Modelo.servicios.ReproductorService;
import Controlador.reproductor.GestorReproductor;
import Modelo.dominio.Cancion;
import Modelo.servicios.SincronizacionService;
import Modelo.dominio.ListaReproduccion;
import Vista.FrmPrincipal;
import javafx.embed.swing.JFXPanel;

public class ControladorPrincipal {
    private FrmPrincipal vista;
    private ListaReproduccion<Cancion> playlist;
    private GestorReproductor playerManager;
    private ReproductorService controlador;

    public ControladorPrincipal(FrmPrincipal vista) {
        this.vista = vista;
        initJavaFX();
        initModelo();
        initControladores();
    }

    private void initJavaFX() {
        new JFXPanel();
    }

    private void initModelo() {
        playlist = new ListaReproduccion<>();
        SincronizacionService.sincronizarConCarpeta();
        SincronizacionService.cargarDesdeBD(playlist);
        controlador = new ReproductorService(playlist);
    }

    private void initControladores() {
        playerManager = new GestorReproductor(vista,playlist,controlador);
    }
}