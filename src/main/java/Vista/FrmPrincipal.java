package Vista;
import javax.swing.ImageIcon;
import javax.swing.*;
public class FrmPrincipal extends javax.swing.JFrame implements VistaReproductor {
    public FrmPrincipal() {
        initComponents();
        setTitle("PulsePlayer");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/redes-sociales.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        panelPlayer = new javax.swing.JPanel();
        lblSongImage = new javax.swing.JLabel();
        lblSongTitle = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        sliderProgress = new javax.swing.JSlider();
        lblTimeStart = new javax.swing.JLabel();
        lblTimeEnd = new javax.swing.JLabel();
        sliderVolume = new javax.swing.JSlider();
        lblVolume = new javax.swing.JLabel();
        btnTogRepeat = new javax.swing.JToggleButton();
        btnTogShuffle = new javax.swing.JToggleButton();
        btnTogPlayPause = new javax.swing.JToggleButton();
        btnTogMute = new javax.swing.JToggleButton();
        btnTogSongFav = new javax.swing.JToggleButton();
        panelSidebar = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnMusicas = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscarCancion = new javax.swing.JTextField();
        panelContenido = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        btnFav = new javax.swing.JButton();
        lblBiblioteca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPlaylists = new javax.swing.JList();
        lblFondo = new javax.swing.JLabel();
        lblSaludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(12, 12, 12));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPlayer.setBackground(new java.awt.Color(18, 18, 18));
        panelPlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSongImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSongImage.setForeground(new java.awt.Color(255, 255, 255));
        lblSongImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kifoku-dj-22618_512.gif"))); // NOI18N
        lblSongImage.setText("Imagen");
        panelPlayer.add(lblSongImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        lblSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSongTitle.setText("The Druiditor");
        panelPlayer.add(lblSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblArtist.setForeground(new java.awt.Color(153, 153, 153));
        lblArtist.setText("Artistas");
        panelPlayer.add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("⏮");
        btnPrev.setBorderPainted(false);
        btnPrev.setContentAreaFilled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        panelPlayer.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("⏭");
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panelPlayer.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

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
        panelPlayer.add(sliderVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 110, -1));

        lblVolume.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVolume.setForeground(new java.awt.Color(29, 185, 84));
        lblVolume.setText("50");
        panelPlayer.add(lblVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 30, 20));

        btnTogRepeat.setForeground(new java.awt.Color(29, 185, 84));
        btnTogRepeat.setSelected(true);
        btnTogRepeat.setText("🔁");
        btnTogRepeat.setBorderPainted(false);
        btnTogRepeat.setContentAreaFilled(false);
        btnTogRepeat.setFocusPainted(false);
        panelPlayer.add(btnTogRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 50, 20));

        btnTogShuffle.setForeground(new java.awt.Color(29, 185, 84));
        btnTogShuffle.setSelected(true);
        btnTogShuffle.setText("🔀");
        btnTogShuffle.setBorderPainted(false);
        btnTogShuffle.setContentAreaFilled(false);
        btnTogShuffle.setFocusPainted(false);
        panelPlayer.add(btnTogShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 50, -1));

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
        panelPlayer.add(btnTogMute, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 60, 30));

        btnTogSongFav.setForeground(new java.awt.Color(255, 255, 255));
        btnTogSongFav.setSelected(true);
        btnTogSongFav.setText("❤");
        btnTogSongFav.setBorderPainted(false);
        btnTogSongFav.setContentAreaFilled(false);
        btnTogSongFav.setFocusPainted(false);
        panelPlayer.add(btnTogSongFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, 30));

        jPanel3.add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 900, 100));

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("PulsePlayer");

        btnMusicas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMusicas.setForeground(new java.awt.Color(255, 255, 255));
        btnMusicas.setText("Musicas");
        btnMusicas.setBorderPainted(false);
        btnMusicas.setContentAreaFilled(false);

        btnBuscar.setForeground(new java.awt.Color(178, 178, 178));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);

        txtBuscarCancion.setBackground(new java.awt.Color(28, 28, 28));
        txtBuscarCancion.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarCancion.setBorder(null);

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblLogo))
                    .addGroup(panelSidebarLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnMusicas)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo)
                .addGap(29, 29, 29)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnMusicas)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jPanel3.add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 430));

        panelContenido.setBackground(new java.awt.Color(18, 18, 18));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("refresh");
        btnRefresh.setToolTipText("");
        btnRefresh.setBorderPainted(false);
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        panelContenido.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        btnFav.setForeground(new java.awt.Color(255, 255, 255));
        btnFav.setText("MOSTRAR FAVORITOS");
        btnFav.setBorderPainted(false);
        btnFav.setContentAreaFilled(false);
        btnFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavActionPerformed(evt);
            }
        });
        panelContenido.add(btnFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        lblBiblioteca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        lblBiblioteca.setText("Lista de Canciones");
        panelContenido.add(lblBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

        listPlaylists.setBackground(new java.awt.Color(0, 0, 0));
        listPlaylists.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listPlaylists.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        listPlaylists.setForeground(new java.awt.Color(0, 204, 0));
        listPlaylists.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lista de Canciones" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listPlaylists.setSelectionBackground(new java.awt.Color(0, 0, 0));
        listPlaylists.setSelectionForeground(new java.awt.Color(51, 255, 51));
        jScrollPane1.setViewportView(listPlaylists);

        panelContenido.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 670, 290));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOverde.jpeg"))); // NOI18N
        panelContenido.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 690, 360));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaludo.setText("Buenos días");
        panelContenido.add(lblSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public JToggleButton getBtnTogPlayPause() {
        return btnTogPlayPause;
    }

    @Override
    public JToggleButton getBtnTogMute() {
        return btnTogMute;
    }

    @Override
    public JButton getBtnNext() {
        return btnNext;
    }

    @Override
    public JButton getBtnPrev() {
        return btnPrev;
    }

    @Override
    public JToggleButton getBtnTogSongFav() {
        return btnTogSongFav;
    }

    @Override
    public JLabel getLblSongTitle() {
        return lblSongTitle;
    }

    @Override
    public JLabel getLblArtist() {
        return lblArtist;
    }

    @Override
    public JLabel getLblTimeStart() {
        return lblTimeStart;
    }

    @Override
    public JLabel getLblTimeEnd() {
        return lblTimeEnd;
    }

    @Override
    public JLabel getLblVolume() {
        return lblVolume;
    }

    @Override
    public JSlider getSliderProgress() {
        return sliderProgress;
    }

    @Override
    public JSlider getSliderVolume() {
        return sliderVolume;
    }
    
    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed

    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnFav;
    public javax.swing.JButton btnMusicas;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnPrev;
    public javax.swing.JButton btnRefresh;
    public javax.swing.JToggleButton btnTogMute;
    public javax.swing.JToggleButton btnTogPlayPause;
    public javax.swing.JToggleButton btnTogRepeat;
    public javax.swing.JToggleButton btnTogShuffle;
    public javax.swing.JToggleButton btnTogSongFav;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblBiblioteca;
    public javax.swing.JLabel lblFondo;
    public javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSaludo;
    public javax.swing.JLabel lblSongImage;
    public javax.swing.JLabel lblSongTitle;
    public javax.swing.JLabel lblTimeEnd;
    public javax.swing.JLabel lblTimeStart;
    public javax.swing.JLabel lblVolume;
    public javax.swing.JList listPlaylists;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelSidebar;
    public javax.swing.JSlider sliderProgress;
    public javax.swing.JSlider sliderVolume;
    public javax.swing.JTextField txtBuscarCancion;
    // End of variables declaration//GEN-END:variables
}
