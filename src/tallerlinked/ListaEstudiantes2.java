
package tallerlinked;

import java.util.Comparator;
import java.util.LinkedList;


public class ListaEstudiantes2 {
    LinkedList<Estudiantes2> otraLista =new LinkedList<>();
    
    public void agregarEstudiante2(Estudiantes2 estudiante){
       otraLista.addLast(estudiante);
    }
       
       public void insertarEstudiante2(int index, Estudiantes2 estudiante){
        otraLista.add (index, estudiante);
    }  
       
       public void eliminarEstudiante2(int id){
        for (Estudiantes2 estudiantes : otraLista) {
            if(estudiantes.getID()==id){
                otraLista.remove(id);

            }

        }   
    }
       public int buscarEstudiante2(int id){
        for (Estudiantes2 estudiantes : otraLista) {
            if(estudiantes.getID()==id){
                return id;
            }
            
        }
        return 0;
        
    }
       
       public void imprimirLista2(){
        for (Estudiantes2 estudiantes : otraLista) {
            System.out.println(estudiantes.toString());
            
        }
        
        
    }
       public void eliminarReprobados2(){
        otraLista.removeIf(estudiante -> estudiante.getPromedio()< 30);
    }
    }
   
