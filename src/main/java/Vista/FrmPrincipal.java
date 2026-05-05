package Vista;
import Modelo.Cancion;
public class FrmPrincipal extends javax.swing.JFrame {
    public FrmPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        panelSidebar = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblBiblioteca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPlaylists = new javax.swing.JList();
        btnAbrirPlaylist = new javax.swing.JButton();
        btnCrearPlaylist = new javax.swing.JButton();
        btnEliminarPlaylist = new javax.swing.JButton();
        txtBuscarCancion = new javax.swing.JTextField();
        panelContenido = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cardPlaylist1 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblImagen12 = new javax.swing.JLabel();
        cardPlaylist2 = new javax.swing.JPanel();
        lblImagen9 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblSubtitulo1 = new javax.swing.JLabel();
        cardPlaylist3 = new javax.swing.JPanel();
        lblImagen10 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblSubtitulo2 = new javax.swing.JLabel();
        cardPlaylist5 = new javax.swing.JPanel();
        lblImagen11 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblSubtitulo3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblImagen15 = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        lblSubtitulo6 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblImagen14 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        lblSubtitulo5 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lblImagen16 = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();
        lblSubtitulo7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblImagen13 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblSubtitulo4 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        panelPlayer = new javax.swing.JPanel();
        lblSongImage = new javax.swing.JLabel();
        lblSongTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnShuffle = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnRepeat = new javax.swing.JButton();
        sliderProgress = new javax.swing.JSlider();
        lblTimeStart = new javax.swing.JLabel();
        lblTimeEnd = new javax.swing.JLabel();
        sliderVolume = new javax.swing.JSlider();
        btnMute = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        lblVolume = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(12, 12, 12));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("Speetinfy");

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);

        btnBuscar.setForeground(new java.awt.Color(178, 178, 178));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);

        lblBiblioteca.setForeground(new java.awt.Color(153, 153, 153));
        lblBiblioteca.setText("TU BIBLIOTECA");

        listPlaylists.setBackground(new java.awt.Color(0, 0, 0));
        listPlaylists.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listPlaylists.setForeground(new java.awt.Color(0, 204, 0));
        listPlaylists.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lista playlists" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listPlaylists.setEnabled(false);
        jScrollPane1.setViewportView(listPlaylists);

        btnAbrirPlaylist.setForeground(new java.awt.Color(0, 204, 0));
        btnAbrirPlaylist.setText("Abrir");
        btnAbrirPlaylist.setBorderPainted(false);
        btnAbrirPlaylist.setContentAreaFilled(false);

        btnCrearPlaylist.setForeground(new java.awt.Color(102, 255, 102));
        btnCrearPlaylist.setText("+ Nueva playlist");
        btnCrearPlaylist.setBorderPainted(false);
        btnCrearPlaylist.setContentAreaFilled(false);

        btnEliminarPlaylist.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarPlaylist.setText("Eliminar");
        btnEliminarPlaylist.setBorderPainted(false);
        btnEliminarPlaylist.setContentAreaFilled(false);

        txtBuscarCancion.setEditable(false);
        txtBuscarCancion.setBackground(new java.awt.Color(28, 28, 28));
        txtBuscarCancion.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarCancion.setText("Buscar...");
        txtBuscarCancion.setBorder(null);

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAbrirPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarPlaylist))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnCrearPlaylist))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblLogo)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSidebarLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(txtBuscarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblBiblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirPlaylist)
                    .addComponent(btnEliminarPlaylist))
                .addContainerGap())
            .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSidebarLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(txtBuscarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(343, Short.MAX_VALUE)))
        );

        jPanel3.add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

        panelContenido.setBackground(new java.awt.Color(18, 18, 18));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaludo.setText("Buenos días");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardPlaylist1.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist1.setPreferredSize(new java.awt.Dimension(150, 150));
        cardPlaylist1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("MEMENTO");
        cardPlaylist1.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo.setText("RE:ZERO");
        cardPlaylist1.add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));
        cardPlaylist1.add(lblImagen12, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 132, 99));

        jPanel2.add(cardPlaylist1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 160));

        cardPlaylist2.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist2.setPreferredSize(new java.awt.Dimension(150, 150));
        cardPlaylist2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen9.setText("jLabel2");
        cardPlaylist2.add(lblImagen9, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 132, 99));

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("lblTitulo");
        cardPlaylist2.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo1.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo1.setText("lblSubtitulo");
        cardPlaylist2.add(lblSubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(cardPlaylist2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 160));

        cardPlaylist3.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist3.setPreferredSize(new java.awt.Dimension(150, 150));
        cardPlaylist3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen10.setText("jLabel2");
        cardPlaylist3.add(lblImagen10, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 124, 99));

        lblTitulo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo4.setText("lblTitulo");
        cardPlaylist3.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo2.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo2.setText("lblSubtitulo");
        cardPlaylist3.add(lblSubtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(cardPlaylist3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, 160));

        cardPlaylist5.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist5.setPreferredSize(new java.awt.Dimension(150, 150));
        cardPlaylist5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen11.setText("jLabel2");
        cardPlaylist5.add(lblImagen11, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 124, 99));

        lblTitulo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo5.setText("lblTitulo");
        cardPlaylist5.add(lblTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo3.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo3.setText("lblSubtitulo");
        cardPlaylist5.add(lblSubtitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(cardPlaylist5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 160));

        jPanel18.setBackground(new java.awt.Color(28, 28, 28));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel18.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen15.setText("jLabel2");
        jPanel18.add(lblImagen15, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 132, 99));

        lblTitulo8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo8.setText("lblTitulo");
        jPanel18.add(lblTitulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo6.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo6.setText("lblSubtitulo");
        jPanel18.add(lblSubtitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 155));

        jPanel17.setBackground(new java.awt.Color(28, 28, 28));
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen14.setText("jLabel2");
        jPanel17.add(lblImagen14, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 132, 99));

        lblTitulo7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo7.setText("lblTitulo");
        jPanel17.add(lblTitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo5.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo5.setText("lblSubtitulo");
        jPanel17.add(lblSubtitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 155));

        jPanel19.setBackground(new java.awt.Color(28, 28, 28));
        jPanel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel19.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen16.setText("jLabel2");
        jPanel19.add(lblImagen16, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 132, 99));

        lblTitulo9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo9.setText("lblTitulo");
        jPanel19.add(lblTitulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo7.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo7.setText("lblSubtitulo");
        jPanel19.add(lblSubtitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 155));

        jPanel16.setBackground(new java.awt.Color(28, 28, 28));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen13.setText("jLabel2");
        jPanel16.add(lblImagen13, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 132, 99));

        lblTitulo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo6.setText("lblTitulo");
        jPanel16.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 114, -1, -1));

        lblSubtitulo4.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo4.setText("lblSubtitulo");
        jPanel16.add(lblSubtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 136, -1, -1));

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 155));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOverde.jpeg"))); // NOI18N
        lblFondo.setText("IMAGEN");
        jPanel2.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 680, 350));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaludo))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblSaludo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 730, 440));

        panelPlayer.setBackground(new java.awt.Color(18, 18, 18));
        panelPlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSongImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSongImage.setForeground(new java.awt.Color(255, 255, 255));
        lblSongImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kifoku-dj-22618_512.gif"))); // NOI18N
        lblSongImage.setText("Imagen");
        panelPlayer.add(lblSongImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 41, 60, 60));

        lblSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSongTitle.setText("The Druiditor");
        panelPlayer.add(lblSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Artistas");
        panelPlayer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 76, -1, -1));

        btnShuffle.setForeground(new java.awt.Color(255, 255, 255));
        btnShuffle.setText("🔀");
        btnShuffle.setBorderPainted(false);
        btnShuffle.setContentAreaFilled(false);
        panelPlayer.add(btnShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 50, -1, -1));

        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("⏮");
        btnPrev.setBorderPainted(false);
        btnPrev.setContentAreaFilled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        panelPlayer.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 50, -1, -1));

        btnPlay.setBackground(new java.awt.Color(29, 185, 84));
        btnPlay.setForeground(new java.awt.Color(29, 185, 84));
        btnPlay.setText("▶ ");
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        panelPlayer.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, -1));

        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("⏭");
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panelPlayer.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 50, -1, -1));

        btnRepeat.setForeground(new java.awt.Color(255, 255, 255));
        btnRepeat.setText("🔁");
        btnRepeat.setBorderPainted(false);
        btnRepeat.setContentAreaFilled(false);
        panelPlayer.add(btnRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        sliderProgress.setBackground(new java.awt.Color(0, 0, 0));
        sliderProgress.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 78, 329, -1));

        lblTimeStart.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeStart.setText("1:24");
        panelPlayer.add(lblTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 79, -1, -1));

        lblTimeEnd.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeEnd.setText("3:45");
        panelPlayer.add(lblTimeEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 79, 31, -1));

        sliderVolume.setBackground(new java.awt.Color(0, 0, 0));
        sliderVolume.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 110, -1));

        btnMute.setForeground(new java.awt.Color(255, 255, 255));
        btnMute.setText("🔊");
        btnMute.setBorderPainted(false);
        btnMute.setContentAreaFilled(false);
        btnMute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuteActionPerformed(evt);
            }
        });
        panelPlayer.add(btnMute, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 60, -1));

        btnPause.setBackground(new java.awt.Color(29, 185, 84));
        btnPause.setForeground(new java.awt.Color(29, 185, 84));
        btnPause.setText("⏸");
        btnPause.setBorderPainted(false);
        btnPause.setContentAreaFilled(false);
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        panelPlayer.add(btnPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        lblVolume.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVolume.setForeground(new java.awt.Color(29, 185, 84));
        lblVolume.setText("50");
        panelPlayer.add(lblVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 30, 20));

        jPanel3.add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 900, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed

    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed

    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnMuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMuteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirPlaylist;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearPlaylist;
    private javax.swing.JButton btnEliminarPlaylist;
    private javax.swing.JButton btnInicio;
    public javax.swing.JButton btnMute;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnPause;
    public javax.swing.JButton btnPlay;
    public javax.swing.JButton btnPrev;
    public javax.swing.JButton btnRepeat;
    public javax.swing.JButton btnShuffle;
    private javax.swing.JPanel cardPlaylist1;
    private javax.swing.JPanel cardPlaylist2;
    private javax.swing.JPanel cardPlaylist3;
    private javax.swing.JPanel cardPlaylist5;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiblioteca;
    public javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen10;
    private javax.swing.JLabel lblImagen11;
    private javax.swing.JLabel lblImagen12;
    private javax.swing.JLabel lblImagen13;
    private javax.swing.JLabel lblImagen14;
    private javax.swing.JLabel lblImagen15;
    private javax.swing.JLabel lblImagen16;
    private javax.swing.JLabel lblImagen9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSaludo;
    public javax.swing.JLabel lblSongImage;
    public javax.swing.JLabel lblSongTitle;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblSubtitulo1;
    private javax.swing.JLabel lblSubtitulo2;
    private javax.swing.JLabel lblSubtitulo3;
    private javax.swing.JLabel lblSubtitulo4;
    private javax.swing.JLabel lblSubtitulo5;
    private javax.swing.JLabel lblSubtitulo6;
    private javax.swing.JLabel lblSubtitulo7;
    public javax.swing.JLabel lblTimeEnd;
    public javax.swing.JLabel lblTimeStart;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    public javax.swing.JLabel lblVolume;
    public javax.swing.JList listPlaylists;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelSidebar;
    public javax.swing.JSlider sliderProgress;
    public javax.swing.JSlider sliderVolume;
    private javax.swing.JTextField txtBuscarCancion;
    // End of variables declaration//GEN-END:variables
}
