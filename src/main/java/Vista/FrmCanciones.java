package Vista;
import javax.swing.*;
public class FrmCanciones extends javax.swing.JFrame implements VistaReproductor {

    public FrmCanciones() {
        initComponents();
        setTitle("PulsePlayer");
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
        scrollTabla = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        panelSidebar = new javax.swing.JPanel();
        btnMiMusica = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnSubirCancion = new javax.swing.JButton();
        btnEliminarCancion = new javax.swing.JButton();
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
        btnTogPlayPause = new javax.swing.JToggleButton();
        btnTogMute = new javax.swing.JToggleButton();
        btnTogSongFav = new javax.swing.JToggleButton();
        btnTogShuffle = new javax.swing.JToggleButton();
        btnTogRepeat = new javax.swing.JToggleButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(12, 12, 12));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(0, 0, 0));
        panelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        panelHeader.setForeground(new java.awt.Color(255, 102, 102));
        panelHeader.setOpaque(false);
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Mi música");
        panelHeader.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        scrollTabla.setBackground(new java.awt.Color(12, 12, 12));
        scrollTabla.setBorder(null);

        tblCanciones.setBackground(new java.awt.Color(153, 153, 153));
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

        panelHeader.add(scrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 740, 350));

        panelPrincipal.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 430));

        panelSidebar.setBackground(new java.awt.Color(0, 0, 0));
        panelSidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        panelSidebar.setOpaque(false);
        panelSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiMusica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMiMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMiMusica.setText("LISTA DE CANCIONES");
        btnMiMusica.setBorderPainted(false);
        btnMiMusica.setContentAreaFilled(false);
        panelSidebar.add(btnMiMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 204, 51));
        lblLogo.setText("PulsePlayer");
        panelSidebar.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnSubirCancion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubirCancion.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirCancion.setText("IMPORTAR CANCION");
        btnSubirCancion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubirCancion.setContentAreaFilled(false);
        panelSidebar.add(btnSubirCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 23));

        btnEliminarCancion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarCancion.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarCancion.setText("Eliminar");
        btnEliminarCancion.setBorderPainted(false);
        btnEliminarCancion.setContentAreaFilled(false);
        panelSidebar.add(btnEliminarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        panelPrincipal.add(panelSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 430));

        panelPlayer.setBackground(new java.awt.Color(18, 18, 18));
        panelPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));
        panelPlayer.setOpaque(false);
        panelPlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSongImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSongImage.setForeground(new java.awt.Color(255, 255, 255));
        lblSongImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2zFo (2).gif"))); // NOI18N
        lblSongImage.setText("Imagen");
        panelPlayer.add(lblSongImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        lblSongTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSongTitle.setText("The Druiditor");
        panelPlayer.add(lblSongTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblArtist.setForeground(new java.awt.Color(153, 153, 153));
        lblArtist.setText("Artistas");
        panelPlayer.add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

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
        panelPlayer.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

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
        panelPlayer.add(sliderVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 110, -1));

        lblVolume.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVolume.setForeground(new java.awt.Color(29, 185, 84));
        lblVolume.setText("50");
        panelPlayer.add(lblVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 30, 20));

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
        panelPlayer.add(btnTogMute, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 60, 20));

        btnTogSongFav.setForeground(new java.awt.Color(255, 255, 255));
        btnTogSongFav.setSelected(true);
        btnTogSongFav.setText("❤");
        btnTogSongFav.setBorderPainted(false);
        btnTogSongFav.setContentAreaFilled(false);
        btnTogSongFav.setFocusPainted(false);
        panelPlayer.add(btnTogSongFav, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 60, 20));

        btnTogShuffle.setForeground(new java.awt.Color(29, 185, 84));
        btnTogShuffle.setSelected(true);
        btnTogShuffle.setText("🔀");
        btnTogShuffle.setBorderPainted(false);
        btnTogShuffle.setContentAreaFilled(false);
        btnTogShuffle.setFocusPainted(false);
        panelPlayer.add(btnTogShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 50, -1));

        btnTogRepeat.setForeground(new java.awt.Color(29, 185, 84));
        btnTogRepeat.setSelected(true);
        btnTogRepeat.setText("🔁");
        btnTogRepeat.setBorderPainted(false);
        btnTogRepeat.setContentAreaFilled(false);
        btnTogRepeat.setFocusPainted(false);
        panelPlayer.add(btnTogRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 50, 20));

        panelPrincipal.add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 980, 100));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2zFo.gif"))); // NOI18N
        panelPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public javax.swing.JButton btnSubirCancion;
    public javax.swing.JToggleButton btnTogMute;
    public javax.swing.JToggleButton btnTogPlayPause;
    public javax.swing.JToggleButton btnTogRepeat;
    public javax.swing.JToggleButton btnTogShuffle;
    public javax.swing.JToggleButton btnTogSongFav;
    public javax.swing.JLabel lblArtist;
    public javax.swing.JLabel lblFondo;
    public javax.swing.JLabel lblLogo;
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
    // End of variables declaration//GEN-END:variables
}
