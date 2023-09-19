package src.main.java.com.ListaTareas.control;

import java.sql.Date;
import java.util.Scanner;

public class tarea {
    private int id;
    private String nombre_tarea;
    private String descripcion;
    private boolean completada;
    private Date fecha_creacion;
    private Date fecha_tarea_completada;
    private String categoria;
    private int pomodoro;


    
    public tarea(int id, String nombre_tarea, String descripcion, boolean completada, Date fecha_creacion,
            Date fecha_tarea_completada, String categoria, int pomodoro) {
        this.id = id;
        this.nombre_tarea = nombre_tarea;
        this.descripcion = descripcion;
        this.completada = completada;
        this.fecha_creacion = fecha_creacion;
        this.fecha_tarea_completada = fecha_tarea_completada;
        this.categoria = categoria;
        this.pomodoro = pomodoro;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public Date getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public Date getFecha_tarea_completada() {
        return fecha_tarea_completada;
    }
    public void setFecha_tarea_completada(Date fecha_tarea_completada) {
        this.fecha_tarea_completada = fecha_tarea_completada;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getPomodoro() {
        return pomodoro;
    }
    public void setPomodoro(int pomodoro) {
        this.pomodoro = pomodoro;
    }
    Scanner scanner = new Scanner(System.in);
    
}
