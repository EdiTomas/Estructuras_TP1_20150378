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
public class NodoCola {
    
   private int id ;
   private String NombreCompleto;
   private NodoCola Siguiente;
    /**
     * @return the id
     */
   public NodoCola(int id, String NombreCompleto){
   
    this.setId(id);
    this.setNombreCompleto(NombreCompleto);
   
   }
   
   
   
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
     * @return the NombreCompleto
     */
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    /**
     * @param NombreCompleto the NombreCompleto to set
     */
    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    /**
     * @return the Siguiente
     */
    public NodoCola getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(NodoCola Siguiente) {
        this.Siguiente = Siguiente;
    }
   
    
    
    
    
    
}
