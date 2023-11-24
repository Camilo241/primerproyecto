package src.main.java.com.ListaTareas.vista;

import javax.swing.*;

import src.main.java.com.ListaTareas.control.ListaTareas;
import src.main.java.com.ListaTareas.control.Tarea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApiVistaGeneral extends JFrame {

    public ApiVistaGeneral() {
        initComponents();
    }

    private void initComponents() {
        JLabel titulo, titulo2, pomodoro;
        titulo = new JLabel("Lista de Tareas");
        titulo.setBounds(25, 50, 300, 20);
        titulo2 = new JLabel("Bienvenido " + getName());
        titulo2.setBounds(25, 75, 300, 20);
        pomodoro = new JLabel("Pomodoro");
        pomodoro.setBounds(25, 100, 300, 150);

        JPanel panel;

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.setBounds(40, 120, 300, 200);
        panel.setBackground(Color.GRAY);

        JLabel label1 = new JLabel("Nombre de la tarea");
        JLabel label2 = new JLabel("Descripcion");
        JButton eliminar = new JButton("X");
        eliminar.setIcon(new ImageIcon("src/main/java/com/ListaTareas/vista/img/rechazar.png"));
        JButton editar = new JButton("Editar tarea");
        JButton iniciar = new JButton("Iniciar");

        panel.add(label1);
        panel.add(eliminar);
        panel.add(label2);
        panel.add(editar);
        panel.add(pomodoro);
        panel.add(iniciar);

        JButton añadirTarea = new JButton("Añadir Tarea");
        añadirTarea.setBounds(230, 75, 120, 20);

        add(panel);
        add(titulo);
        add(titulo2);
        add(añadirTarea);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        añadirTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {// tengo el archivo
                añadirTareaActionPerformed(evt); // llamo el elemento
            }
        });
    }

    private void añadirTareaActionPerformed(ActionEvent evt) {
        String nombreTarea = JOptionPane.showInputDialog("Nombre de la tarea:");

        // Solicitar al usuario la descripción de la tarea
        String descripcion = JOptionPane.showInputDialog("Descripción:");

        // Solicitar al usuario la categoría de la tarea
        String categoria = JOptionPane.showInputDialog("Categoría:");

        // // Crear una instancia de Tarea con los datos ingresados
        // Tarea nuevaTarea = new Tarea(0, nombreTarea, descripcion, false, categoria, 0);

        // Crear una instancia de ListaTareas
        ListaTareas listaTareas = new ListaTareas();

        // Agregar la nueva tarea a la lista de tareas
        // listaTareas.agregarTarea(nuevaTarea);

        JOptionPane.showMessageDialog(null, "Tarea agregada exitosamente.");
    }
}
