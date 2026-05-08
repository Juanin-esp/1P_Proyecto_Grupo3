package com.mycompany.p_proyecto_grupo3;
import Vista.FrmLogin;
import Controlador.ControladorLogin;
public class App {
    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
        new ControladorLogin(login);
        login.setVisible(true);
    }
}