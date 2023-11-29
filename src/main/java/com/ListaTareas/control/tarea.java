package src.main.java.com.ListaTareas.control;

import java.util.Scanner;

public class Tarea extends ListaTareas{
    Scanner scanner = new Scanner(System.in);
    private String nombre_tarea;
    private String descripcion;
    private boolean completada;



    public Tarea( String nombre_tarea, String descripcion, boolean completada) {
        this.nombre_tarea = nombre_tarea;
        this.descripcion = descripcion;
        this.completada = completada;
    }




    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}
