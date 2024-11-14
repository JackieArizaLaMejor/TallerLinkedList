import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Tarea {
    int id;
    String descripcion;
    int prioridad;
    String estado;

    public Tarea(int id, String descripcion, int prioridad, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
    }
}

public class GestionTareas {
    private Queue<Tarea> tareasPendientes = new LinkedList<>();
    private Stack<Tarea> historialTareas = new Stack<>();

    public void agregarTarea(Tarea tarea) {
        tareasPendientes.add(tarea);
    }

    public void completarTarea() {
        if (!tareasPendientes.isEmpty()) {
            Tarea tarea = tareasPendientes.poll();
            tarea.estado = "Completada";
            historialTareas.push(tarea);
        }
    }

    public Tarea mostrarProximaTarea() {
        return tareasPendientes.peek();
    }

    public Tarea mostrarUltimaTareaCompletada() {
        return historialTareas.isEmpty() ? null : historialTareas.peek();
    }
}
