package src.main.java.com.ListaTareas.control;

import java.io.*;
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

    public void guardarTareasEnArchivo(String nombreArchivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(tareas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarTareasDesdeArchivo(String nombreArchivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            tareas = (List<Tarea>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
