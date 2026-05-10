package Controlador;

import Modelo.Cancion;
import Modelo.Playlist;
import Vista.FrmPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementPlayer implements ActionListener {

    private FrmPrincipal vista;

    private Controlador controlador;

    private VolumeManager volumeManager;
    private ProgressManager progressManager;
    private FavoritoManager favoritoManager;

    private PlaylistUIManager playlistUI;
    private SearchManager searchManager;
    private NavigationManager navigationManager;
    private PlayerUIUpdater uiUpdater;

    private Cancion cancionSeleccionada;

    public ManagementPlayer(FrmPrincipal vista,Playlist<Cancion> playlist,Controlador controlador) {
        this.vista = vista;
        this.controlador = controlador;
        favoritoManager = new FavoritoManager(vista, playlist);
        playlistUI = new PlaylistUIManager(vista,playlist,controlador);
        searchManager = new SearchManager(vista,playlist,controlador,playlistUI);
        navigationManager = new NavigationManager(vista,playlist,controlador,playlistUI);
        uiUpdater = new PlayerUIUpdater(vista,favoritoManager,playlistUI);
        volumeManager = new VolumeManager(vista,controlador);
        progressManager = new ProgressManager(vista,controlador);
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
    }

    private void initBotones() {
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

            favoritoManager.toggleFavorito(
                    cancionSeleccionada
            );
        }
        if (source == vista.btnFav) {
            favoritoManager.mostrarSoloFavoritas();
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
    }
}