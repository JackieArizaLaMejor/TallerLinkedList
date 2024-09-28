
package tallerlinked;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class ListaEstudiantes {
    LinkedList<Estudiantes> lista = new LinkedList<>();
    LinkedList<Estudiantes2> otraLista =new LinkedList<>();
    
    public void agregarEstudiante(Estudiantes estudiante){
       lista.addLast(estudiante);
       
    }
    
    public void agregarEstudiante2(Estudiantes2 estudiante){
       otraLista.addLast(estudiante);
       
    }
    
    
    public void insertarEstudiante(int index, Estudiantes estudiante){
        lista.add (index, estudiante);
    }
    
    public void insertarEstudiante2(int index, Estudiantes2 estudiante){
        otraLista.add (index, estudiante);
    }    
    
    public void eliminarEstudiante(int id){
        for (Estudiantes estudiantes : lista) {
            if(estudiantes.getID()==id){
                lista.remove(id);

            }

        }   
    }
    
    public void eliminarEstudiante2(int id){
        for (Estudiantes2 estudiantes : otraLista) {
            if(estudiantes.getID()==id){
                otraLista.remove(id);

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
    public int buscarEstudiante2(int id){
        for (Estudiantes2 estudiantes : otraLista) {
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
    public void imprimirLista2(){
        for (Estudiantes2 estudiantes : otraLista) {
            System.out.println(estudiantes.toString());
            
        }
        
        
    }
    
    
    public void eliminarReprobados(){
        for (Estudiantes estudiantes : lista) {
            if(estudiantes.getID()<30){
                lista.remove(estudiantes);
                
            }
            
        }
    }
    
    public void eliminarReprobados2(){
        for (Estudiantes2 estudiantes : otraLista) {
            if(estudiantes.getID()<30){
                otraLista.remove(estudiantes);
                
            }
            
        }
    }
    
    
    
    
}
