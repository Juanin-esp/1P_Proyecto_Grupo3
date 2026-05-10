package Controlador.app;

import Vista.FrmLogin;
import Vista.FrmPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin implements ActionListener {

    private FrmLogin vistaLogin;

    public ControladorLogin(FrmLogin vistaLogin) {

        this.vistaLogin = vistaLogin;

        initEventos();
    }

    private void initEventos() {
        vistaLogin.btnLogin.addActionListener(this);
        vistaLogin.btnSalir.addActionListener(this);
        vistaLogin.btnMostrarPass.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vistaLogin.btnLogin) {
            login();
        }
        if (source == vistaLogin.btnSalir) {
            System.exit(0);
        }
        if (source == vistaLogin.btnMostrarPass) {

            togglePassword();
        }
    }
    private void login() {

        String usuario = vistaLogin.txtUsuario.getText().trim();

        String password = new String(vistaLogin.txtPassword.getPassword());

        if (usuario.equals("admin") && password.equals("123")) {
            abrirPrincipal();
            vistaLogin.lblError.setVisible(false);
        } else {
            vistaLogin.lblError.setText("Usuario o contraseña incorrectos");
            vistaLogin.lblError.setVisible(true);
        }
    }

    private void abrirPrincipal() {
        FrmPrincipal vistaPrincipal = new FrmPrincipal();
        new ControladorPrincipal(vistaPrincipal);
        vistaPrincipal.setVisible(true);
        vistaLogin.dispose();
    }

    private void togglePassword() {
        if (vistaLogin.txtPassword.getEchoChar() == '\u0000') {
            vistaLogin.txtPassword.setEchoChar('•');
        } else {
            vistaLogin.txtPassword.setEchoChar((char) 0);
        }
    }
}