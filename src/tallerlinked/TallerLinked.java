
package tallerlinked;

import java.util.LinkedList;
public class TallerLinked {



    public static void main(String[] args) {
        // Crear instancia de ListaEstudiantes
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();

        // Crear estudiantes de ejemplo
        Estudiantes estudiante1 = new Estudiantes(1, "Juan", 31);
        Estudiantes estudiante2 = new Estudiantes(2, "Maria", 40);
        Estudiantes estudiante3 = new Estudiantes(3, "Luis", 50);
        Estudiantes estudiante4 = new Estudiantes(4, "Ana", 38);
        Estudiantes estudiante5 = new Estudiantes(5, "Brayan", 29);
        Estudiantes estudiante6 = new Estudiantes(6, "Alfonso", 28);

        // Agregar estudiantes a la lista
        listaEstudiantes.agregarEstudiante(estudiante1);
        listaEstudiantes.agregarEstudiante(estudiante2);
        listaEstudiantes.agregarEstudiante(estudiante3);

        // Imprimir lista actual de estudiantes
        System.out.println("Lista inicial de estudiantes:");
        listaEstudiantes.imprimirLista();

        // Insertar un estudiante en una posición específica
        listaEstudiantes.insertarEstudiante(0, estudiante4);
        listaEstudiantes.insertarEstudiante(0, estudiante5);
        listaEstudiantes.insertarEstudiante(0, estudiante6);

        // Imprimir lista después de la inserción
        System.out.println("\nLista después de insertar un estudiante:");
        listaEstudiantes.imprimirLista();

        // Buscar un estudiante por ID
        int idBuscado = 2;
        int resultadoBusqueda = listaEstudiantes.buscarEstudiante(idBuscado);
        if (resultadoBusqueda != 0) {
            System.out.println("\nEstudiante con ID " + idBuscado + " encontrado.");
        } else {
            System.out.println("\nEstudiante con ID " + idBuscado + " no encontrado.");
        }

        // Eliminar un estudiante por ID
        listaEstudiantes.eliminarEstudiante(3);

        // Imprimir lista después de eliminar un estudiante
        System.out.println("\nLista después de eliminar el estudiante con ID 3:");
        listaEstudiantes.imprimirLista();

        // Eliminar estudiantes reprobados (nota < 30)
        listaEstudiantes.eliminarReprobados();

        // Imprimir lista después de eliminar estudiantes reprobados
        System.out.println("\nLista después de eliminar estudiantes reprobados:");
        listaEstudiantes.imprimirLista();
    }
}


