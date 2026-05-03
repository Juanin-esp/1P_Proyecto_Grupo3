package Vista;

public class FrmMusica extends javax.swing.JFrame {

    public FrmMusica() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelSidebar = new javax.swing.JPanel();
        txtBuscarSidebar = new javax.swing.JTextField();
        btnRecientes = new javax.swing.JButton();
        btnMiMusica = new javax.swing.JButton();
        btnListas = new javax.swing.JButton();
        btnEnCurso = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnNuevaLista = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        panelReproductor = new javax.swing.JPanel();
        lblSongImage = new javax.swing.JLabel();
        lblSongTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTimeStart = new javax.swing.JLabel();
        sliderProgress = new javax.swing.JSlider();
        btnShuffle = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnRepeat = new javax.swing.JButton();
        lblTimeEnd = new javax.swing.JLabel();
        btnVolume = new javax.swing.JButton();
        sliderVolume = new javax.swing.JSlider();
        pnlGeneral = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        btnSubirCancion1 = new javax.swing.JButton();
        panelTabs = new javax.swing.JPanel();
        btnArtistas = new javax.swing.JButton();
        btnCanciones = new javax.swing.JButton();
        btnAlbumes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOrdenar = new javax.swing.JLabel();
        cbFecha = new javax.swing.JComboBox<>();
        txtBuscarTabla = new javax.swing.JTextField();
        pnlTabla = new javax.swing.JPanel();
        scrollTabla = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(12, 12, 12));
        panelPrincipal.setLayout(new java.awt.BorderLayout());

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));

        txtBuscarSidebar.setEditable(false);
        txtBuscarSidebar.setBackground(new java.awt.Color(28, 28, 28));
        txtBuscarSidebar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarSidebar.setText("Buscar...");
        txtBuscarSidebar.setBorder(null);

        btnRecientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRecientes.setText("Reproducciones recientes");
        btnRecientes.setBorderPainted(false);
        btnRecientes.setContentAreaFilled(false);

        btnMiMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMiMusica.setText("Mi música");
        btnMiMusica.setBorderPainted(false);
        btnMiMusica.setContentAreaFilled(false);

        btnListas.setForeground(new java.awt.Color(255, 255, 255));
        btnListas.setText("Listas de reproducción");
        btnListas.setBorderPainted(false);
        btnListas.setContentAreaFilled(false);

        btnEnCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnEnCurso.setText("Reproducción en curso");
        btnEnCurso.setBorderPainted(false);
        btnEnCurso.setContentAreaFilled(false);

        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);

        btnNuevaLista.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaLista.setText("+");
        btnNuevaLista.setBorderPainted(false);
        btnNuevaLista.setContentAreaFilled(false);

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("Spotify");

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfiguracion)
                    .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSidebarLayout.createSequentialGroup()
                            .addComponent(btnListas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNuevaLista))
                        .addComponent(btnRecientes)
                        .addComponent(btnMiMusica)
                        .addComponent(btnEnCurso)
                        .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLogo)
                            .addComponent(txtBuscarSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMiMusica)
                .addGap(18, 18, 18)
                .addComponent(btnRecientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnCurso)
                .addGap(18, 18, 18)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListas)
                    .addComponent(btnNuevaLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btnConfiguracion)
                .addGap(44, 44, 44))
        );

        panelPrincipal.add(panelSidebar, java.awt.BorderLayout.LINE_START);

        panelReproductor.setBackground(new java.awt.Color(18, 18, 18));

        lblSongImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSongImage.setForeground(new java.awt.Color(255, 255, 255));
        lblSongImage.setText("Imagen");

        lblSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSongTitle.setText("The Druiditor");

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Artistas");

        lblTimeStart.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeStart.setText("1:24");

        sliderProgress.setForeground(new java.awt.Color(29, 185, 84));

        btnShuffle.setForeground(new java.awt.Color(255, 255, 255));
        btnShuffle.setText("🔀");
        btnShuffle.setBorderPainted(false);
        btnShuffle.setContentAreaFilled(false);

        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("⏮");
        btnPrev.setBorderPainted(false);
        btnPrev.setContentAreaFilled(false);

        btnPlay.setBackground(new java.awt.Color(29, 185, 84));
        btnPlay.setForeground(new java.awt.Color(29, 185, 84));
        btnPlay.setText("▶ / ⏸");
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);

        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("⏭");
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);

        btnRepeat.setForeground(new java.awt.Color(255, 255, 255));
        btnRepeat.setText("🔁");
        btnRepeat.setBorderPainted(false);
        btnRepeat.setContentAreaFilled(false);

        lblTimeEnd.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeEnd.setText("3:45");

        btnVolume.setForeground(new java.awt.Color(255, 255, 255));
        btnVolume.setText("🔊");
        btnVolume.setBorderPainted(false);
        btnVolume.setContentAreaFilled(false);

        sliderVolume.setForeground(new java.awt.Color(29, 185, 84));

        javax.swing.GroupLayout panelReproductorLayout = new javax.swing.GroupLayout(panelReproductor);
        panelReproductor.setLayout(panelReproductorLayout);
        panelReproductorLayout.setHorizontalGroup(
            panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReproductorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSongImage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSongTitle)
                    .addComponent(jLabel1))
                .addGap(116, 116, 116)
                .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelReproductorLayout.createSequentialGroup()
                        .addComponent(btnShuffle)
                        .addGap(53, 53, 53)
                        .addComponent(btnPrev)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlay)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(66, 66, 66)
                        .addComponent(btnRepeat))
                    .addGroup(panelReproductorLayout.createSequentialGroup()
                        .addComponent(lblTimeStart)
                        .addGap(18, 18, 18)
                        .addComponent(sliderProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReproductorLayout.createSequentialGroup()
                        .addComponent(lblTimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReproductorLayout.createSequentialGroup()
                        .addComponent(btnVolume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        panelReproductorLayout.setVerticalGroup(
            panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReproductorLayout.createSequentialGroup()
                .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReproductorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSongImage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReproductorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelReproductorLayout.createSequentialGroup()
                                .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShuffle)
                                    .addComponent(btnPrev)
                                    .addComponent(btnPlay)
                                    .addComponent(btnNext)
                                    .addComponent(btnRepeat)
                                    .addComponent(btnVolume)
                                    .addComponent(sliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelReproductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sliderProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTimeStart)
                                    .addComponent(lblTimeEnd)))
                            .addGroup(panelReproductorLayout.createSequentialGroup()
                                .addComponent(lblSongTitle)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelReproductor, java.awt.BorderLayout.PAGE_END);

        pnlGeneral.setBackground(new java.awt.Color(51, 51, 51));

        panelHeader.setBackground(new java.awt.Color(0, 0, 0));
        panelHeader.setForeground(new java.awt.Color(255, 102, 102));

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Mi música");

        btnExportar.setBackground(new java.awt.Color(51, 204, 0));
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("Exportar");
        btnExportar.setBorderPainted(false);

        btnSubirCancion1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirCancion1.setText("Subir canción");
        btnSubirCancion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubirCancion1.setContentAreaFilled(false);

        panelTabs.setBackground(new java.awt.Color(12, 12, 12));

        btnArtistas.setForeground(new java.awt.Color(255, 255, 255));
        btnArtistas.setText("Artistas");
        btnArtistas.setBorderPainted(false);
        btnArtistas.setContentAreaFilled(false);

        btnCanciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCanciones.setText("Canciones");
        btnCanciones.setBorderPainted(false);
        btnCanciones.setContentAreaFilled(false);

        btnAlbumes.setForeground(new java.awt.Color(255, 255, 255));
        btnAlbumes.setText("Álbumes");
        btnAlbumes.setBorderPainted(false);
        btnAlbumes.setContentAreaFilled(false);

        javax.swing.GroupLayout panelTabsLayout = new javax.swing.GroupLayout(panelTabs);
        panelTabs.setLayout(panelTabsLayout);
        panelTabsLayout.setHorizontalGroup(
            panelTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnCanciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArtistas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlbumes)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panelTabsLayout.setVerticalGroup(
            panelTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArtistas)
                    .addComponent(btnCanciones)
                    .addComponent(btnAlbumes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(12, 12, 12));

        lblOrdenar.setBackground(new java.awt.Color(153, 153, 153));
        lblOrdenar.setForeground(new java.awt.Color(153, 153, 153));
        lblOrdenar.setText("Ordenar por: ");

        cbFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha de adición" }));
        cbFecha.setBorder(null);
        cbFecha.setOpaque(true);

        txtBuscarTabla.setEditable(false);
        txtBuscarTabla.setBackground(new java.awt.Color(28, 28, 28));
        txtBuscarTabla.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarTabla.setText("Buscar en canciones...");
        txtBuscarTabla.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOrdenar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTabla.setBackground(new java.awt.Color(0, 0, 0));

        scrollTabla.setBackground(new java.awt.Color(12, 12, 12));
        scrollTabla.setBorder(null);

        tblCanciones.setBackground(new java.awt.Color(24, 24, 24));
        tblCanciones.setForeground(new java.awt.Color(29, 185, 84));
        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "♡"},
                {"", " ", "", "", "", "♥️"}
            },
            new String [] {
                "#", "Titulo", "Artitsta", "Album", "Duracion", "❤️"
            }
        ));
        tblCanciones.setGridColor(new java.awt.Color(0, 0, 0));
        tblCanciones.setOpaque(false);
        tblCanciones.setRowHeight(30);
        tblCanciones.setShowGrid(false);
        scrollTabla.setViewportView(tblCanciones);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubirCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportar)
                .addGap(42, 42, 42))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(btnExportar)
                    .addComponent(btnSubirCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(panelTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPrincipal.add(pnlGeneral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlbumes;
    private javax.swing.JButton btnArtistas;
    private javax.swing.JButton btnCanciones;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEnCurso;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnListas;
    private javax.swing.JButton btnMiMusica;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNuevaLista;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRecientes;
    private javax.swing.JButton btnRepeat;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnSubirCancion1;
    private javax.swing.JButton btnVolume;
    private javax.swing.JComboBox<String> cbFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOrdenar;
    private javax.swing.JLabel lblSongImage;
    private javax.swing.JLabel lblSongTitle;
    private javax.swing.JLabel lblTimeEnd;
    private javax.swing.JLabel lblTimeStart;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelReproductor;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelTabs;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JSlider sliderProgress;
    private javax.swing.JSlider sliderVolume;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTextField txtBuscarSidebar;
    private javax.swing.JTextField txtBuscarTabla;
    // End of variables declaration//GEN-END:variables
}
