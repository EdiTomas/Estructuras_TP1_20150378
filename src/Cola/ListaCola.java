/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author edi
 */
public class ListaCola 
{
     NodoCola Primero = null;
     NodoCola Ultimo = null;
    
    
    public Boolean EstaVacio()
    {
      return Primero== null && Ultimo==null; 
    }   

    public void Encolar(int id, String NombreCompleto)
    {
          NodoCola nuevaCola = new NodoCola(id,NombreCompleto);
          
          if(EstaVacio())
          {
              Primero = Ultimo = nuevaCola;
              Primero.setSiguiente(null);
              Ultimo.setSiguiente(null);
             System.out.println("id: "+Primero.getId()+" Se ha insertado con Exito!");
          }
          else
          {
              nuevaCola.setSiguiente(Primero);
              Primero = nuevaCola;
              Ultimo.setSiguiente(null);
             System.out.println("id: "+Primero.getId()+" Se ha insertado con Exito!");
          }
    }

    public void Desencolar()
    {
        if(!EstaVacio()){
          if(Primero == Ultimo)
          {
               System.out.println("Id: " + Primero.getId());
               System.out.println("Nombre: " + Primero.getNombreCompleto());
               System.out.println("*************Eliminado****************");
               Primero = Ultimo = null;
              
          }else
          {
              NodoCola  Actual = Primero;
              while(Actual !=null)
              { 
              if(Actual.getSiguiente()== Ultimo)
                    {
                              System.out.println("Id: " + Ultimo.getId());
                              System.out.println("Nombre: " + Ultimo.getNombreCompleto());
                              System.out.println("*************Eliminado****************");
                              Actual.setSiguiente(null);
                              Ultimo = Actual;
                    }
                Actual = Actual.getSiguiente();
              } // fin del While 
              
          }    
        }else{
            System.out.println("Error en Desencolar, Cola Vacia");
        }
        
        
        
        
          
}
    
    public Boolean buscarLista(int id){
       NodoCola indice;
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
    
    
    
    
    public void Imprimir(){
    
            NodoCola actual = Primero;
            while(actual != null)
            {
                System.out.println("Id: "+actual.getId() );   
                System.out.println("NombreCompleto: "+actual.getNombreCompleto()+"\n" );   
                actual = actual.getSiguiente();
            }
    }
    
    
    
    
    
}
