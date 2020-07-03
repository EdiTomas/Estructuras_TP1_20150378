/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaOrdenada;

/**
 *
 * @author edi
 */
public class ListaOrdenada {

    NodoLista Primero = null;
    NodoLista Ultimo = null;

    public Boolean EstaVacio() {
        return Primero == null && Ultimo == null;
    }

    public Boolean buscarLista(int id) {
        NodoLista indice;
        Boolean existe = false;
        for (indice = Primero; indice != null; indice = indice.getSiguiente()) {
            if (id == indice.getId()) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void InsertarOrden(int id, String Nombre, String Descripcion) {

        NodoLista nuevo = new NodoLista(id, Nombre, Descripcion);

        if (EstaVacio()) {
            nuevo.setSiguiente(null);
            Primero = Ultimo = nuevo;
            System.out.println("id " + Primero.getId() + " Insertado con exito!");
        } else if (id < Primero.getId()) {
            nuevo.setSiguiente(Primero);
            Primero = nuevo;
            System.out.println("id " + Primero.getId() + " Insertado con exito!");

        } else {
            NodoLista anterior, p;
            anterior = p = Primero;
            while ((p.getSiguiente() != null) && (id > p.getId())) {
                anterior = p;
                p = p.getSiguiente();
            }
            if (id > p.getId()) {
                anterior = p;
           //   System.out.println("id " + id + " Insertado con exito! ");
             }
            nuevo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevo);
              System.out.println("id " + nuevo.getId() + " Insertado con exito! ");  
        }

    }

    public void Eliminar(int id) {

        if (!EstaVacio()) {
            NodoLista Actual = Primero;
            NodoLista Anterior = null;
            while (Actual != null) {
                if (Actual.getId() == id) {
                    break;
                } else {
                    Anterior = Actual;
                    Actual = Actual.getSiguiente();
                }
            }
            if (Actual != null) {
                if (Actual == Primero) {
                    Primero = Primero.getSiguiente();
                
                } else {
                    Anterior.setSiguiente(Actual.getSiguiente());
                }
             System.out.println("id " + Actual.getId() + " Se ha Eliminado con exito");
                  Actual = null;

            }
        } else {
            System.out.println("No existe elementos en La lista");
        }
 }
    
    public void RerrorerLista(){
        
          NodoLista Actual = Primero ;
           while(Actual != null )
           {
                 System.out.println("Id" + Actual.getId() );
                 Actual = Actual.getSiguiente();
           }
    
    
    }
    
    

}
