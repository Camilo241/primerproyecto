package src.main.java.com.ListaTareas.vista;

import javax.swing.*;
import java.awt.*;

public class ApiVista  extends JFrame{
    public ApiVista() {
        setTitle("Lista de Tareas");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear etiquetas
        JLabel label1 = new JLabel("Tarea ");
        //JLabel label2 = new JLabel("La tarea 2: ");

        // Crear botones
        JButton boton1 = new JButton("Iniciar Tarea");
        boton1.setSize(100 ,50);
        JButton boton2 = new JButton("Pausar Tarea");

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2)); // GridLayout de 2 filas y 2 columnas

        // Agregar los componentes al panel
        
        panel.add(boton1);
        //panel.add(label2);
        panel.add(boton2);
        panel.add(label1);
        // Agregar el panel a la ventana
        add(panel);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }
}

