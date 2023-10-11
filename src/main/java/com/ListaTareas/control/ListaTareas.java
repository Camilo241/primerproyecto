package src.main.java.com.ListaTareas.control;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<tarea> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    public void addtarea(tarea tarea) {
        tareas.add(tarea);
    }

    public void removetarea(tarea tarea) {
        tareas.remove(tarea);
    }

    public List<tarea> gettareas() {
        return tareas;
    }
}
