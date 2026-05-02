package com.mycompany.p_proyecto_grupo3;
import Vista.FrmPrincipal;
import Controlador.ManagementApp;
public class App {
    public static void main(String[] args) {
        FrmPrincipal vista = new FrmPrincipal();
        new ManagementApp(vista);
        vista.setVisible(true);
    }
}