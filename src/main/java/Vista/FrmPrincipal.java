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
        panelContenido = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lblImagen13 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblSubtitulo4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblImagen14 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        lblSubtitulo5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblImagen15 = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        lblSubtitulo6 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lblImagen16 = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();
        lblSubtitulo7 = new javax.swing.JLabel();
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
        btnVolume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(12, 12, 12));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("Spotify");

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
                        .addGap(54, 54, 54)
                        .addComponent(lblLogo)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lblBiblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirPlaylist)
                    .addComponent(btnEliminarPlaylist))
                .addContainerGap())
        );

        jPanel3.add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

        panelContenido.setBackground(new java.awt.Color(18, 18, 18));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaludo.setText("Buenos días");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(2, 4, 10, 10));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));

        cardPlaylist1.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist1.setPreferredSize(new java.awt.Dimension(150, 150));

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("MEMENTO");

        lblSubtitulo.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo.setText("RE:ZERO");

        javax.swing.GroupLayout cardPlaylist1Layout = new javax.swing.GroupLayout(cardPlaylist1);
        cardPlaylist1.setLayout(cardPlaylist1Layout);
        cardPlaylist1Layout.setHorizontalGroup(
            cardPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardPlaylist1Layout.createSequentialGroup()
                        .addGroup(cardPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo1)
                            .addComponent(lblSubtitulo))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardPlaylist1Layout.setVerticalGroup(
            cardPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPlaylist1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo))
        );

        cardPlaylist2.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist2.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen9.setText("jLabel2");

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("lblTitulo");

        lblSubtitulo1.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo1.setText("lblSubtitulo");

        javax.swing.GroupLayout cardPlaylist2Layout = new javax.swing.GroupLayout(cardPlaylist2);
        cardPlaylist2.setLayout(cardPlaylist2Layout);
        cardPlaylist2Layout.setHorizontalGroup(
            cardPlaylist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPlaylist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardPlaylist2Layout.createSequentialGroup()
                        .addGroup(cardPlaylist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo3)
                            .addComponent(lblSubtitulo1))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardPlaylist2Layout.setVerticalGroup(
            cardPlaylist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo1)
                .addContainerGap())
        );

        cardPlaylist3.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist3.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen10.setText("jLabel2");

        lblTitulo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo4.setText("lblTitulo");

        lblSubtitulo2.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo2.setText("lblSubtitulo");

        javax.swing.GroupLayout cardPlaylist3Layout = new javax.swing.GroupLayout(cardPlaylist3);
        cardPlaylist3.setLayout(cardPlaylist3Layout);
        cardPlaylist3Layout.setHorizontalGroup(
            cardPlaylist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPlaylist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPlaylist3Layout.createSequentialGroup()
                        .addGroup(cardPlaylist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo4)
                            .addComponent(lblSubtitulo2))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(cardPlaylist3Layout.createSequentialGroup()
                        .addComponent(lblImagen10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        cardPlaylist3Layout.setVerticalGroup(
            cardPlaylist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo2))
        );

        cardPlaylist5.setBackground(new java.awt.Color(28, 28, 28));
        cardPlaylist5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cardPlaylist5.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen11.setText("jLabel2");

        lblTitulo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo5.setText("lblTitulo");

        lblSubtitulo3.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo3.setText("lblSubtitulo");

        javax.swing.GroupLayout cardPlaylist5Layout = new javax.swing.GroupLayout(cardPlaylist5);
        cardPlaylist5.setLayout(cardPlaylist5Layout);
        cardPlaylist5Layout.setHorizontalGroup(
            cardPlaylist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPlaylist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPlaylist5Layout.createSequentialGroup()
                        .addGroup(cardPlaylist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo5)
                            .addComponent(lblSubtitulo3))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(cardPlaylist5Layout.createSequentialGroup()
                        .addComponent(lblImagen11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        cardPlaylist5Layout.setVerticalGroup(
            cardPlaylist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPlaylist5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo3))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(cardPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardPlaylist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardPlaylist3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardPlaylist5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardPlaylist2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(cardPlaylist1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(cardPlaylist3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(cardPlaylist5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel16.setBackground(new java.awt.Color(28, 28, 28));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen13.setText("jLabel2");

        lblTitulo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo6.setText("lblTitulo");

        lblSubtitulo4.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo4.setText("lblSubtitulo");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo6)
                            .addComponent(lblSubtitulo4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo4))
        );

        jPanel17.setBackground(new java.awt.Color(28, 28, 28));
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen14.setText("jLabel2");

        lblTitulo7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo7.setText("lblTitulo");

        lblSubtitulo5.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo5.setText("lblSubtitulo");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo7)
                            .addComponent(lblSubtitulo5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo5))
        );

        jPanel18.setBackground(new java.awt.Color(28, 28, 28));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel18.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen15.setText("jLabel2");

        lblTitulo8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo8.setText("lblTitulo");

        lblSubtitulo6.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo6.setText("lblSubtitulo");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo8)
                            .addComponent(lblSubtitulo6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo6))
        );

        jPanel19.setBackground(new java.awt.Color(28, 28, 28));
        jPanel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel19.setPreferredSize(new java.awt.Dimension(150, 150));

        lblImagen16.setText("jLabel2");

        lblTitulo9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo9.setText("lblTitulo");

        lblSubtitulo7.setForeground(new java.awt.Color(179, 179, 179));
        lblSubtitulo7.setText("lblSubtitulo");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo9)
                            .addComponent(lblSubtitulo7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaludo))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblSaludo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
        panelPlayer.add(lblSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 53, -1, -1));

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
        btnPlay.setText("▶ / ⏸");
        btnPlay.setBorderPainted(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        panelPlayer.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 50, -1, -1));

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
        panelPlayer.add(btnRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 50, -1, -1));

        sliderProgress.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 78, 329, -1));

        lblTimeStart.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeStart.setText("1:24");
        panelPlayer.add(lblTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 79, -1, -1));

        lblTimeEnd.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeEnd.setText("3:45");
        panelPlayer.add(lblTimeEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 79, 31, -1));

        sliderVolume.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 110, -1));

        btnVolume.setForeground(new java.awt.Color(255, 255, 255));
        btnVolume.setText("🔊");
        btnVolume.setBorderPainted(false);
        btnVolume.setContentAreaFilled(false);
        panelPlayer.add(btnVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        jPanel3.add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 900, 130));

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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirPlaylist;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearPlaylist;
    private javax.swing.JButton btnEliminarPlaylist;
    private javax.swing.JButton btnInicio;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnPlay;
    public javax.swing.JButton btnPrev;
    public javax.swing.JButton btnRepeat;
    public javax.swing.JButton btnShuffle;
    public javax.swing.JButton btnVolume;
    private javax.swing.JPanel cardPlaylist1;
    private javax.swing.JPanel cardPlaylist2;
    private javax.swing.JPanel cardPlaylist3;
    private javax.swing.JPanel cardPlaylist5;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiblioteca;
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
    public javax.swing.JList listPlaylists;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelSidebar;
    public javax.swing.JSlider sliderProgress;
    public javax.swing.JSlider sliderVolume;
    // End of variables declaration//GEN-END:variables
}
