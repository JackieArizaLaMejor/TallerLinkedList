
package tallerlinked;

import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class ListaEstudiantes {
    LinkedList<Estudiantes> lista = new LinkedList<>();
    
    public void agregarEstudiante(Estudiantes estudiante){
       lista.addLast(estudiante);
       
    }
    
    
    public void insertarEstudiante(int index, Estudiantes estudiante){
        lista.addFirst (estudiante);
    }
    
    
    
    
    public void eliminarEstudiante(int id){
        for (Estudiantes estudiantes : lista) {
            if(estudiantes.getID()==id){
                lista.remove(id);
            
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
    
    public LinkedList obtenerTopEstudiantes(int n){
        
        return null;
        
    }
    
    public void imprimirLista(){
        for (Estudiantes estudiantes : lista) {
            System.out.println(estudiantes.toString());
            
        }
        
        
    }
    
    
}
