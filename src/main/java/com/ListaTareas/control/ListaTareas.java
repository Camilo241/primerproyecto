package src.main.java.com.ListaTareas.control;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<Tarea> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }

}
