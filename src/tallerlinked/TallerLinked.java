
package tallerlinked;
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
        //lista 2
          lista2();
    }
     public static void lista2(){
         ListaEstudiantes2 listaEstudiantes2 = new ListaEstudiantes2();
           // Crear estudiantes de ejemplo
        Estudiantes2 estudiante01 = new Estudiantes2(1, "Jrian", 32);
        Estudiantes2 estudiante02 = new Estudiantes2(2, "Julieta", 46);
        Estudiantes2 estudiante03 = new Estudiantes2(3, "Louis", 49);
        Estudiantes2 estudiante04 = new Estudiantes2(4, "Anita", 39);
        Estudiantes2 estudiante05 = new Estudiantes2(5, "David", 29.4);
        Estudiantes2 estudiante06 = new Estudiantes2(6, "Andres", 28);

        // Agregar estudiantes a la lista
        listaEstudiantes2.agregarEstudiante2(estudiante01);
        listaEstudiantes2.agregarEstudiante2(estudiante02);
        listaEstudiantes2.agregarEstudiante2(estudiante03);

        // Imprimir lista actual de estudiantes
        System.out.println("Lista inicial de estudiantes:");
        listaEstudiantes2.imprimirLista2();

        // Insertar un estudiante en una posición específica
        listaEstudiantes2.insertarEstudiante2(0, estudiante04);
        listaEstudiantes2.insertarEstudiante2(0, estudiante05);
        listaEstudiantes2.insertarEstudiante2(0, estudiante06);

        // Imprimir lista después de la inserción
        System.out.println("\nLista después de insertar un estudiante:");
        listaEstudiantes2.imprimirLista2();

        // Buscar un estudiante por ID
        int idBuscado = 2;
        int resultadoBusqueda = listaEstudiantes2.buscarEstudiante2(idBuscado);
        if (resultadoBusqueda != 0) {
            System.out.println("\nEstudiante con ID " + idBuscado + " encontrado.");
        } else {
            System.out.println("\nEstudiante con ID " + idBuscado + " no encontrado.");
        }

        // Eliminar un estudiante por ID
        listaEstudiantes2.eliminarEstudiante2(3);

        // Imprimir lista después de eliminar un estudiante
        System.out.println("\nLista después de eliminar el estudiante con ID 3:");
        listaEstudiantes2.imprimirLista2();

        // Eliminar estudiantes reprobados (nota < 30)
        listaEstudiantes2.eliminarReprobados2();

        // Imprimir lista después de eliminar estudiantes reprobados
        System.out.println("\nLista después de eliminar estudiantes reprobados:");
        listaEstudiantes2.imprimirLista2(); 
        }
     
}


