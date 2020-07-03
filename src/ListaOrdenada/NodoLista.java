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
public class NodoLista {
    private int id;
    private String Nombre;
    private String Descripcion;
    private NodoLista Siguiente;
    
    public NodoLista(int id, String Nombre, String Descripcion)
    {
        this.setId(id);
        this.setNombre(Nombre);
        this.setDescripcion(Descripcion);
    }
    
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Siguiente
     */
    public NodoLista getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(NodoLista Siguiente) {
        this.Siguiente = Siguiente;
    }
    
    
    
    
    
}
