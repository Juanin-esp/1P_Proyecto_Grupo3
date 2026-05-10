package com.mycompany.p_proyecto_grupo3;
import Vista.FrmLogin;
import Vista.FrmPrincipal;
import Controlador.app.ControladorLogin;
import Controlador.app.ControladorPrincipal;
public class App {
    public static void main(String[] args) {
        FrmPrincipal vista = new FrmPrincipal();
        new ControladorPrincipal(vista);
        vista.setVisible(true);
    }
}