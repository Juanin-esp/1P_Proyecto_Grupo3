package Controlador.reproductor;

import Modelo.servicios.ReproductorService;
import Modelo.servicios.BusquedaService;
import Modelo.servicios.FavoritoService;
import Modelo.dominio.Cancion;
import Modelo.dominio.ListaReproduccion;
import Vista.FrmPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorReproductor implements ActionListener {

    private FrmPrincipal vista;

    private ReproductorService controlador;

    private GestorVolumen volumeManager;
    private GestorProgreso progressManager;
    private FavoritoService favoritoManager;

    private GestorUIPlaylist playlistUI;
    private BusquedaService searchManager;
    private GestorNavegacion navigationManager;
    private ActualizadorUIReproductor uiUpdater;

    private Cancion cancionSeleccionada;

    public GestorReproductor(FrmPrincipal vista,ListaReproduccion<Cancion> playlist,ReproductorService controlador) {
        this.vista = vista;
        this.controlador = controlador;
        favoritoManager = new FavoritoService(playlist);
        playlistUI = new GestorUIPlaylist(vista,playlist,controlador);
        searchManager = new BusquedaService(vista,playlist,controlador,playlistUI);
        navigationManager = new GestorNavegacion(vista,playlist,controlador,playlistUI);
        uiUpdater = new ActualizadorUIReproductor(vista,favoritoManager,playlistUI);
        volumeManager = new GestorVolumen(vista,controlador);
        progressManager = new GestorProgreso(vista,controlador);
        controlador.addOnCancionCambiada(cancion -> {
            cancionSeleccionada = cancion;
            uiUpdater.actualizar(cancion);
        });

        initBotones();

        progressManager.initSliderGUI();
        progressManager.initSlider();
        progressManager.initTimeline();

        volumeManager.init();
        volumeManager.sincronizarUI();

        controlador.sincronizarVistaActual();
        sincronizarToggles();
    }

    private void initBotones() {
        vista.btnTogShuffle.addActionListener(this);
        vista.btnTogRepeat.addActionListener(this);
        vista.btnTogPlayPause.addActionListener(this);
        vista.btnNext.addActionListener(this);
        vista.btnPrev.addActionListener(this);
        vista.btnTogMute.addActionListener(this);
        vista.btnTogSongFav.addActionListener(this);
        vista.btnFav.addActionListener(this);
        vista.btnRefresh.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        vista.btnMusicas.addActionListener(this);
        vista.txtBuscarCancion.addActionListener(e -> searchManager.buscarCancion());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vista.btnTogPlayPause) {

            if (vista.btnTogPlayPause.isSelected()) {

                controlador.playOrResumeActual();

                vista.btnTogPlayPause.setText("⏸");

            } else {

                controlador.pause();

                vista.btnTogPlayPause.setText("▶");
            }
        }
        if (source == vista.btnNext) {

            controlador.siguiente();
        }
        if (source == vista.btnPrev) {

            controlador.anterior();
        }
        if (source == vista.btnTogMute) {

            volumeManager.toggleMute();
        }
        if (source == vista.btnTogSongFav) {
            Cancion actual =
            controlador.getCancionActual();
            if (actual != null) {
                favoritoManager.toggleFavorito(actual);
                vista.btnTogSongFav.setSelected(
                        actual.isCancionFav()
                );
                vista.btnTogSongFav.setText(actual.isCancionFav() ? "❤️" : "💔");
            }
        }
        if (source == vista.btnFav) {
            playlistUI.mostrarSoloFavoritas();
        }
        if (source == vista.btnRefresh) {
            playlistUI.cargarLista();
        }
        if (source == vista.btnBuscar) {
            searchManager.buscarCancion();
        }

        if (source == vista.btnMusicas) {
            navigationManager.abrirFrmCanciones();
        }
        if (e.getSource() == vista.btnTogShuffle) {
            controlador.toggleShuffle();
            vista.btnTogShuffle.setSelected(
                    controlador.isShuffle()
            );
        }
        
        if (e.getSource() == vista.btnTogRepeat) {
            controlador.toggleRepeat();
            vista.btnTogRepeat.setSelected(
                    controlador.isRepeat()
            );
        }
    }
    private void sincronizarToggles() {
        vista.btnTogShuffle.setSelected(
                controlador.isShuffle()
        );
        vista.btnTogRepeat.setSelected(
                controlador.isRepeat()
        );
    }
}