package Vista;

public class FrmCanciones extends javax.swing.JFrame {

    public FrmCanciones() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnSubirCancion1 = new javax.swing.JButton();
        panelTabs = new javax.swing.JPanel();
        btnArtistas = new javax.swing.JButton();
        btnCanciones = new javax.swing.JButton();
        btnAlbumes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOrdenar = new javax.swing.JLabel();
        cbFecha = new javax.swing.JComboBox<>();
        txtBuscarTabla = new javax.swing.JTextField();
        scrollTabla = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        btnEliminarPlaylist = new javax.swing.JButton();
        panelSidebar = new javax.swing.JPanel();
        txtBuscarSidebar = new javax.swing.JTextField();
        btnRecientes = new javax.swing.JButton();
        btnMiMusica = new javax.swing.JButton();
        btnListas = new javax.swing.JButton();
        btnEnCurso = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnNuevaLista = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        panelPlayer = new javax.swing.JPanel();
        lblSongImage = new javax.swing.JLabel();
        lblSongTitle = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        btnShuffle = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnRepeat = new javax.swing.JButton();
        sliderProgress = new javax.swing.JSlider();
        lblTimeStart = new javax.swing.JLabel();
        lblTimeEnd = new javax.swing.JLabel();
        sliderVolume = new javax.swing.JSlider();
        lblVolume = new javax.swing.JLabel();
        btnTogPlayPause = new javax.swing.JToggleButton();
        btnTogMute = new javax.swing.JToggleButton();
        btnTogSongFav = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(12, 12, 12));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(0, 0, 0));
        panelHeader.setForeground(new java.awt.Color(255, 102, 102));

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Mi música");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
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

        scrollTabla.setBackground(new java.awt.Color(12, 12, 12));
        scrollTabla.setBorder(null);

        tblCanciones.setBackground(new java.awt.Color(24, 24, 24));
        tblCanciones.setForeground(new java.awt.Color(29, 185, 84));
        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "♡"},
                {" ", "", "", "", "♥️"}
            },
            new String [] {
                "Titulo", "Artitsta", "Album", "Duracion", "❤️"
            }
        ));
        tblCanciones.setGridColor(new java.awt.Color(0, 0, 0));
        tblCanciones.setOpaque(false);
        tblCanciones.setRowHeight(30);
        tblCanciones.setShowGrid(false);
        scrollTabla.setViewportView(tblCanciones);

        btnEliminarPlaylist.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarPlaylist.setText("Eliminar");
        btnEliminarPlaylist.setBorderPainted(false);
        btnEliminarPlaylist.setContentAreaFilled(false);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(panelTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnSubirCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPlaylist)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(511, 511, 511))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarPlaylist)
                        .addComponent(btnSubirCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 670, 460));

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));
        panelSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarSidebar.setEditable(false);
        txtBuscarSidebar.setBackground(new java.awt.Color(28, 28, 28));
        txtBuscarSidebar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarSidebar.setText("Buscar...");
        txtBuscarSidebar.setBorder(null);
        panelSidebar.add(txtBuscarSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 54, 129, -1));

        btnRecientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRecientes.setText("Reproducciones recientes");
        btnRecientes.setBorderPainted(false);
        btnRecientes.setContentAreaFilled(false);
        panelSidebar.add(btnRecientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 123, -1, -1));

        btnMiMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMiMusica.setText("Mi música");
        btnMiMusica.setBorderPainted(false);
        btnMiMusica.setContentAreaFilled(false);
        panelSidebar.add(btnMiMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btnListas.setForeground(new java.awt.Color(255, 255, 255));
        btnListas.setText("Listas de reproducción");
        btnListas.setBorderPainted(false);
        btnListas.setContentAreaFilled(false);
        panelSidebar.add(btnListas, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 199, -1, -1));

        btnEnCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnEnCurso.setText("Reproducción en curso");
        btnEnCurso.setBorderPainted(false);
        btnEnCurso.setContentAreaFilled(false);
        panelSidebar.add(btnEnCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 158, -1, -1));

        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);
        panelSidebar.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        btnNuevaLista.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaLista.setText("+");
        btnNuevaLista.setBorderPainted(false);
        btnNuevaLista.setContentAreaFilled(false);
        panelSidebar.add(btnNuevaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 199, -1, -1));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("Speentify");
        panelSidebar.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 11, -1, -1));

        panelPrincipal.add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        panelPlayer.setBackground(new java.awt.Color(18, 18, 18));
        panelPlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSongImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSongImage.setForeground(new java.awt.Color(255, 255, 255));
        lblSongImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kifoku-dj-22618_512.gif"))); // NOI18N
        lblSongImage.setText("Imagen");
        panelPlayer.add(lblSongImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        lblSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSongTitle.setText("The Druiditor");
        panelPlayer.add(lblSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        lblArtist.setForeground(new java.awt.Color(153, 153, 153));
        lblArtist.setText("Artistas");
        panelPlayer.add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        btnShuffle.setForeground(new java.awt.Color(255, 255, 255));
        btnShuffle.setText("🔀");
        btnShuffle.setBorderPainted(false);
        btnShuffle.setContentAreaFilled(false);
        panelPlayer.add(btnShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("⏮");
        btnPrev.setBorderPainted(false);
        btnPrev.setContentAreaFilled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        panelPlayer.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("⏭");
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panelPlayer.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        btnRepeat.setForeground(new java.awt.Color(255, 255, 255));
        btnRepeat.setText("🔁");
        btnRepeat.setBorderPainted(false);
        btnRepeat.setContentAreaFilled(false);
        panelPlayer.add(btnRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        sliderProgress.setBackground(new java.awt.Color(0, 0, 0));
        sliderProgress.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 329, -1));

        lblTimeStart.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeStart.setText("00:00");
        panelPlayer.add(lblTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        lblTimeEnd.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeEnd.setText("00:00");
        panelPlayer.add(lblTimeEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 31, -1));

        sliderVolume.setBackground(new java.awt.Color(0, 0, 0));
        sliderVolume.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 110, -1));

        lblVolume.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVolume.setForeground(new java.awt.Color(29, 185, 84));
        lblVolume.setText("50");
        panelPlayer.add(lblVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 30, 20));

        btnTogPlayPause.setForeground(new java.awt.Color(29, 185, 84));
        btnTogPlayPause.setSelected(true);
        btnTogPlayPause.setText("▶ ");
        btnTogPlayPause.setBorderPainted(false);
        btnTogPlayPause.setContentAreaFilled(false);
        btnTogPlayPause.setFocusPainted(false);
        panelPlayer.add(btnTogPlayPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 50, -1));

        btnTogMute.setForeground(new java.awt.Color(255, 255, 255));
        btnTogMute.setSelected(true);
        btnTogMute.setText("🔊");
        btnTogMute.setBorderPainted(false);
        btnTogMute.setContentAreaFilled(false);
        btnTogMute.setFocusPainted(false);
        panelPlayer.add(btnTogMute, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 60, 30));

        btnTogSongFav.setForeground(new java.awt.Color(255, 255, 255));
        btnTogSongFav.setSelected(true);
        btnTogSongFav.setText("❤");
        btnTogSongFav.setBorderPainted(false);
        btnTogSongFav.setContentAreaFilled(false);
        btnTogSongFav.setFocusPainted(false);
        panelPlayer.add(btnTogSongFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, 30));

        panelPrincipal.add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 880, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed

    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

    }//GEN-LAST:event_btnNextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlbumes;
    private javax.swing.JButton btnArtistas;
    private javax.swing.JButton btnCanciones;
    private javax.swing.JButton btnConfiguracion;
    public javax.swing.JButton btnEliminarPlaylist;
    private javax.swing.JButton btnEnCurso;
    private javax.swing.JButton btnListas;
    private javax.swing.JButton btnMiMusica;
    public javax.swing.JButton btnNext;
    private javax.swing.JButton btnNuevaLista;
    public javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRecientes;
    public javax.swing.JButton btnRepeat;
    public javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnSubirCancion1;
    public javax.swing.JToggleButton btnTogMute;
    public javax.swing.JToggleButton btnTogPlayPause;
    public javax.swing.JToggleButton btnTogSongFav;
    private javax.swing.JComboBox<String> cbFecha;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOrdenar;
    public javax.swing.JLabel lblSongImage;
    public javax.swing.JLabel lblSongTitle;
    public javax.swing.JLabel lblTimeEnd;
    public javax.swing.JLabel lblTimeStart;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblVolume;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelTabs;
    private javax.swing.JScrollPane scrollTabla;
    public javax.swing.JSlider sliderProgress;
    public javax.swing.JSlider sliderVolume;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTextField txtBuscarSidebar;
    private javax.swing.JTextField txtBuscarTabla;
    // End of variables declaration//GEN-END:variables
}
