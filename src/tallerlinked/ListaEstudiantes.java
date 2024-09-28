
package tallerlinked;

import java.util.Comparator;
import java.util.LinkedList;


public class ListaEstudiantes {
    LinkedList<Estudiantes> lista = new LinkedList<>();
    
    
    public void agregarEstudiante(Estudiantes estudiante){
       lista.addLast(estudiante);
       
    }
    
    
    public void insertarEstudiante(int index, Estudiantes estudiante){
        lista.add (index, estudiante);
    }
    
    public void eliminarEstudiante(int id){
        for (Estudiantes estudiantes : lista) {
            if(estudiantes.getID()==id){
                System.out.println("Estudiante eliminado" + estudiantes.toString());
                lista.remove(estudiantes);

            }

        }   
    }
    
    
    
    public int buscarEstudiante(int id){
        for (Estudiantes estudiantes : lista) {
            if(estudiantes.getID()==id){
                return id;
            }
            
        }
        return 0;
        
    }
    
    
    public LinkedList<Estudiantes> obtenerTopEstudiantes(int n) {
    lista.sort(Comparator.comparingDouble(Estudiantes::getPromedio).reversed());
    
    return new LinkedList<>(lista.subList(0, Math.min(n, lista.size())));
}
    
    public void fusionarListas(LinkedList<Estudiantes> otraLista) {
        lista.addAll(otraLista);
    }
    
    public void imprimirLista(){
        for (Estudiantes estudiantes : lista) {
            System.out.println(estudiantes.toString());
            
        }
        
        
    }
    
    public void eliminarReprobados(){
        lista.removeIf(estudiante -> estudiante.getPromedio()< 30);
    }
    
    
}
