package com.mycompany.p_proyecto_grupo3;
import Vista.FrmLogin;
import Controlador.app.ControladorLogin;
public class App {
    public static void main(String[] args) {
        FrmLogin vista = new FrmLogin();
        new ControladorLogin(vista);
        vista.setVisible(true);
    }
}