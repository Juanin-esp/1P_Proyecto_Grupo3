package Vista;
import javax.swing.ImageIcon;
public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        setTitle("Speentify");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/redes-sociales.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        lblError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMostrarPass = new javax.swing.JButton();
        chkRecordar = new javax.swing.JCheckBox();
        lblError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setBackground(new java.awt.Color(12, 12, 12));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Iniciar Sesión");
        panelLogin.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuario");
        panelLogin.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Contraseña");
        panelLogin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(28, 28, 28));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        panelLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 196, 20));

        btnLogin.setBackground(new java.awt.Color(12, 12, 12));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 204, 0));
        btnLogin.setText("INICIAR SESIÓN");
        btnLogin.setBorderPainted(false);
        panelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        btnSalir.setBackground(new java.awt.Color(12, 12, 12));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        panelLogin.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        btnMostrarPass.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarPass.setText("👁");
        btnMostrarPass.setBorderPainted(false);
        btnMostrarPass.setContentAreaFilled(false);
        panelLogin.add(btnMostrarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        chkRecordar.setBackground(new java.awt.Color(12, 12, 12));
        chkRecordar.setForeground(new java.awt.Color(255, 255, 255));
        chkRecordar.setText("Recordarme");
        panelLogin.add(chkRecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lblError.setBackground(new java.awt.Color(255, 76, 76));
        lblError.setForeground(new java.awt.Color(255, 76, 76));
        lblError.setText("Error de validación");
        panelLogin.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        txtPassword.setBackground(new java.awt.Color(28, 28, 28));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        panelLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 200, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("123");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("admin");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnMostrarPass;
    public javax.swing.JButton btnSalir;
    public javax.swing.JCheckBox chkRecordar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lblError;
    public javax.swing.JLabel lblPassword;
    public javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JPanel panelLogin;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
