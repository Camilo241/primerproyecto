package src.test;

import javax.swing.SwingUtilities;

import src.main.java.com.ListaTareas.control.Pomodoro;
import src.main.java.com.ListaTareas.vista.ApiVista;

public class Main {
    public static void main(String[] args) {
        new Pomodoro(); 
        SwingUtilities.invokeLater(() -> {
            ApiVista ventana = new ApiVista();
            ventana.setVisible(true);
        });
    }
}