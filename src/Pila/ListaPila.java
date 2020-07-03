/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author edi
 */
public class ListaPila {

   NodoPila Primero = null;
   NodoPila Ultimo = null;
  
      public Boolean EstaVacio()
      {
      return Primero== null && Ultimo==null; 
      }   
  
      
      public Boolean buscarLista(int id){
       NodoPila indice;
       Boolean existe = false;
       for(indice = Primero; indice !=null; indice = indice.getSiguiente() )
       {
            if(id == indice.getId()){
                 existe = true;
                 break;
       }
       }
       return existe;
    }
      
     public void Push(int id, String Nombre,String Apellido)
    {
          NodoPila nuevaPila = new NodoPila(id,Nombre,Apellido);
          
          if(EstaVacio())
          {
              Primero = Ultimo = nuevaPila;
              Primero.setSiguiente(null);
              Ultimo.setSiguiente(null);
              System.out.println("id: "+Primero.getId()+" Se ha insertado con Exito");
          }
          else
          {
              nuevaPila.setSiguiente(Primero);
              Primero = nuevaPila;
              Ultimo.setSiguiente(null);
              System.out.println("id: "+Primero.getId()+" Se ha insertado con Exito");
        
          }
    }
 
     public void Pop(){
     
          if(!EstaVacio()){
           if(Primero == Ultimo)
           {
               System.out.println("Id:" + Primero.getId());
               System.out.println("Nombre:" + Primero.getNombre());
               System.out.println("Apellido:" + Primero.getApellido());
               System.out.println("******Eliminado********");    
            Primero =Ultimo= null;
               
           }else
           {
            NodoPila Actual = Primero;
               System.out.println("Id:" + Primero.getId());
               System.out.println("Nombre:" + Primero.getNombre());
               System.out.println("Apellido:" + Primero.getApellido());
               System.out.println("******Eliminado********");    
            Primero = null;
            Actual = Actual.getSiguiente();
            Primero = Actual;
                 
           }
           }
          
          else
           {
                System.out.println("Error en Pop, pila vacia");
           }
     
     
     
     }
     
     


    
}
