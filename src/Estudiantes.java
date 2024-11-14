class Estudiante {
    int id;
    String nombre;
    double calificacion;

    public Estudiante(int id, String nombre, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
}

class Nodo {
    Estudiante estudiante;
    Nodo izquierdo, derecho;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

public class ArbolCalificaciones {
    private Nodo raiz;

    public void insertar(Estudiante estudiante) {
        raiz = insertarRec(raiz, estudiante);
    }

    private Nodo insertarRec(Nodo raiz, Estudiante estudiante) {
        if (raiz == null) {
            raiz = new Nodo(estudiante);
            return raiz;
        }
        if (estudiante.id < raiz.estudiante.id) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, estudiante);
        } else if (estudiante.id > raiz.estudiante.id) {
            raiz.derecho = insertarRec(raiz.derecho, estudiante);
        }
        return raiz;
    }

    public Estudiante buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Estudiante buscarRec(Nodo raiz, int id) {
        if (raiz == null || raiz.estudiante.id == id)
            return (raiz != null) ? raiz.estudiante : null;
        if (id < raiz.estudiante.id)
            return buscarRec(raiz.izquierdo, id);
        return buscarRec(raiz.derecho, id);
    }

    public void mostrarEnOrden() {
        mostrarEnOrdenRec(raiz);
    }

    private void mostrarEnOrdenRec(Nodo raiz) {
        if (raiz != null) {
            mostrarEnOrdenRec(raiz.izquierdo);
            System.out.println("ID: " + raiz.estudiante.id + ", Nombre: " + raiz.estudiante.nombre + ", Calificación: " + raiz.estudiante.calificacion);
            mostrarEnOrdenRec(raiz.derecho);
        }
    }
}
