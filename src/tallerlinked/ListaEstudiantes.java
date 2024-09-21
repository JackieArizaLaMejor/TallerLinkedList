
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
        boolean a = lista.contains(id);
        if( a == true){
            lista.remove(id);
            System.out.println("ID removido: " + id);
            
        }
        System.out.println("No se encontro ID");
  
    }
    
    public void buscarEstudiante(int id){
        int a = lista.indexOf(id);
        System.out.println("El id es: " + a);
        
    }
    
    public LinkedList obtenerTopEstudiantes(int n){
        
        return null;
        
    }
    
    public void imprimirLista(){
        for (Estudiantes estudiantes : lista) {
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
    
    
    
    
    
}
