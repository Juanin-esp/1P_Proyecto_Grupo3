package Vista;
import javax.swing.*;
public class FrmCanciones extends javax.swing.JFrame implements PlayerView {

    public FrmCanciones() {
        initComponents();
        setTitle("Speentify");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/redes-sociales.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnSubirCancion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOrdenar = new javax.swing.JLabel();
        cbFecha = new javax.swing.JComboBox<>();
        txtBuscarTabla = new javax.swing.JTextField();
        scrollTabla = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        btnEliminarCancion = new javax.swing.JButton();
        panelSidebar = new javax.swing.JPanel();
        btnMiMusica = new javax.swing.JButton();
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
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Mi música");
        panelHeader.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 17, -1, -1));

        btnSubirCancion.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirCancion.setText("Subir canción");
        btnSubirCancion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubirCancion.setContentAreaFilled(false);
        panelHeader.add(btnSubirCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 90, 23));

        jPanel2.setBackground(new java.awt.Color(12, 12, 12));

        lblOrdenar.setBackground(new java.awt.Color(153, 153, 153));
        lblOrdenar.setForeground(new java.awt.Color(153, 153, 153));
        lblOrdenar.setText("Ordenar por: ");

        cbFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha de adición" }));
        cbFecha.setBorder(null);
        cbFecha.setOpaque(true);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
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

        panelHeader.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 641, -1));

        scrollTabla.setBackground(new java.awt.Color(12, 12, 12));
        scrollTabla.setBorder(null);

        tblCanciones.setBackground(new java.awt.Color(255, 255, 255));
        tblCanciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblCanciones.setForeground(new java.awt.Color(0, 0, 0));
        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", "", "", "♡"},
                {null, " ", "", "", "", "♥️"}
            },
            new String [] {
                "ID", "Titulo", "Artitsta", "Ruta", "Duracion", "Favorita"
            }
        ));
        tblCanciones.setGridColor(new java.awt.Color(0, 0, 0));
        tblCanciones.setOpaque(false);
        tblCanciones.setRowHeight(30);
        tblCanciones.setShowGrid(false);
        scrollTabla.setViewportView(tblCanciones);

        panelHeader.add(scrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 670, 293));

        btnEliminarCancion.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarCancion.setText("Eliminar");
        btnEliminarCancion.setBorderPainted(false);
        btnEliminarCancion.setContentAreaFilled(false);
        panelHeader.add(btnEliminarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        panelPrincipal.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 730, 460));

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));
        panelSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMiMusica.setText("Mi música");
        btnMiMusica.setBorderPainted(false);
        btnMiMusica.setContentAreaFilled(false);
        panelSidebar.add(btnMiMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("Speentify");
        panelSidebar.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        panelPrincipal.add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 460));

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
        panelPlayer.add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        btnShuffle.setForeground(new java.awt.Color(255, 255, 255));
        btnShuffle.setText("🔀");
        btnShuffle.setBorderPainted(false);
        btnShuffle.setContentAreaFilled(false);
        panelPlayer.add(btnShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

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
        panelPlayer.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        btnRepeat.setForeground(new java.awt.Color(255, 255, 255));
        btnRepeat.setText("🔁");
        btnRepeat.setBorderPainted(false);
        btnRepeat.setContentAreaFilled(false);
        panelPlayer.add(btnRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        sliderProgress.setBackground(new java.awt.Color(0, 0, 0));
        sliderProgress.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 329, -1));

        lblTimeStart.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeStart.setText("00:00");
        panelPlayer.add(lblTimeStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        lblTimeEnd.setForeground(new java.awt.Color(153, 153, 153));
        lblTimeEnd.setText("00:00");
        panelPlayer.add(lblTimeEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 31, -1));

        sliderVolume.setBackground(new java.awt.Color(0, 0, 0));
        sliderVolume.setForeground(new java.awt.Color(29, 185, 84));
        panelPlayer.add(sliderVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 110, -1));

        lblVolume.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVolume.setForeground(new java.awt.Color(29, 185, 84));
        lblVolume.setText("50");
        panelPlayer.add(lblVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 30, 20));

        btnTogPlayPause.setForeground(new java.awt.Color(29, 185, 84));
        btnTogPlayPause.setSelected(true);
        btnTogPlayPause.setText("▶ ");
        btnTogPlayPause.setBorderPainted(false);
        btnTogPlayPause.setContentAreaFilled(false);
        btnTogPlayPause.setFocusPainted(false);
        panelPlayer.add(btnTogPlayPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 50, -1));

        btnTogMute.setForeground(new java.awt.Color(255, 255, 255));
        btnTogMute.setSelected(true);
        btnTogMute.setText("🔊");
        btnTogMute.setBorderPainted(false);
        btnTogMute.setContentAreaFilled(false);
        btnTogMute.setFocusPainted(false);
        panelPlayer.add(btnTogMute, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 60, 30));

        btnTogSongFav.setForeground(new java.awt.Color(255, 255, 255));
        btnTogSongFav.setSelected(true);
        btnTogSongFav.setText("❤");
        btnTogSongFav.setBorderPainted(false);
        btnTogSongFav.setContentAreaFilled(false);
        btnTogSongFav.setFocusPainted(false);
        panelPlayer.add(btnTogSongFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 70, 30));

        panelPrincipal.add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 870, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminarCancion;
    public javax.swing.JButton btnMiMusica;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnPrev;
    public javax.swing.JButton btnRepeat;
    public javax.swing.JButton btnShuffle;
    public javax.swing.JButton btnSubirCancion;
    public javax.swing.JToggleButton btnTogMute;
    public javax.swing.JToggleButton btnTogPlayPause;
    public javax.swing.JToggleButton btnTogSongFav;
    public javax.swing.JComboBox<String> cbFecha;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblArtist;
    public javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblOrdenar;
    public javax.swing.JLabel lblSongImage;
    public javax.swing.JLabel lblSongTitle;
    public javax.swing.JLabel lblTimeEnd;
    public javax.swing.JLabel lblTimeStart;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblVolume;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSidebar;
    public javax.swing.JScrollPane scrollTabla;
    public javax.swing.JSlider sliderProgress;
    public javax.swing.JSlider sliderVolume;
    public javax.swing.JTable tblCanciones;
    public javax.swing.JTextField txtBuscarTabla;
    // End of variables declaration//GEN-END:variables
}
