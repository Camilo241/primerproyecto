package src.main.java.com.ListaTareas.vista;

import javax.swing.*;

import src.main.java.com.ListaTareas.control.tarea;

import java.awt.*;

public class ApiVistaGeneral extends JFrame {
    JFrame principal;

    ApiVistaGeneral() {
        JLabel titulo, titulo2, pomodoro;
        titulo = new JLabel("Lista de Tareas");
        titulo.setBounds(25, 50, 300, 20);
        titulo2 = new JLabel("Bienvenido " + getName());
        titulo2.setBounds(25, 75, 300, 20);
        pomodoro = new JLabel("Pomodoro");
        pomodoro.setBounds(25, 100, 300, 150);

        JPanel panel;

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBounds(40, 120, 300, 200);
        panel.setBackground(Color.GRAY);

        JPanel horizontalPanel1 = new JPanel();
        horizontalPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton eliminar = new JButton("X");
        JTextField t1 = new JTextField("Nombre de la tarea");

        horizontalPanel1.add(t1);
        horizontalPanel1.add(eliminar);

        JPanel horizontalPanel2 = new JPanel();
        horizontalPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton editar = new JButton("Editar tarea");
        JTextField t2 = new JTextField("Descripcion");

        horizontalPanel2.add(t2);
        horizontalPanel2.add(editar);

        JLabel ntarea = new JLabel("Numero de la tarea");
        ntarea.setBounds(40, 100, 300, 20);

        panel.add(ntarea);
        panel.add(horizontalPanel1);
        panel.add(horizontalPanel2);
        panel.add(pomodoro);

        JButton añadirTarea = new JButton("Añadir Tarea");
        añadirTarea.setBounds(230, 75, 120, 20);

        add(panel);
        add(titulo);
        add(titulo2);
        add(añadirTarea);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ApiVistaGeneral();
    }
}
