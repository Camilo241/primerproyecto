package src.main.java.com.ListaTareas.vista;

import javax.swing.*;

import src.main.java.com.ListaTareas.control.tarea;

import java.awt.*;

public class ApiVistaGeneral extends JFrame {// inheriting JFrame
    JFrame principal;

    ApiVistaGeneral() {
        JLabel titulo, titulo2, ntarea, pomodoro;
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

        JTextField t1, t2;
        ntarea = new JLabel("Numero de la tarea");
        ntarea.setBounds(40, 100, 300, 20);

        t1 = new JTextField("Nombre de la tarea");
        t2 = new JTextField("Descripcion");


        JButton añadirTarea, eliminar, editar;
        añadirTarea = new JButton("Añadir Tarea");
        añadirTarea.setBounds(230, 75, 120, 20);

        eliminar = new JButton("X");
        eliminar.setBounds(230, 150, 120, 20);

        editar = new JButton("Editar tarea");
        editar.setBounds(230, 170, 120, 20);

        add(panel);
        panel.add(t1);
        panel.add(t2);
        panel.add(pomodoro);
        panel.add(eliminar);
        panel.add(editar);
        add(titulo);
        add(titulo2);
        add(ntarea);
        add(añadirTarea);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ApiVistaGeneral();
    }
}
