
package comandos;

import java.util.*;


public class Listas { 
 
   public void Agregar(String nombre, List posicion){
        posicion.add(nombre);
      System.out.println("posicion lista = "+posicion.size());
      Iterator iter = posicion.iterator();
      while(iter.hasNext()){
       System.out.println("iter.next() = "+iter.next());
      }
    }
    
    public void Prioridad(String nombre){
        
    }
    public void CambiarPrioridad(String nombre, int prioridad){
        
    }
    
}
