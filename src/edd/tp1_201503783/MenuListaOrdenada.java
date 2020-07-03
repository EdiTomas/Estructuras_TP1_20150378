/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tp1_201503783;

import ListaOrdenada.ListaOrdenada;
import static edd.tp1_201503783.Menu.ANSI_BLACK;
import static edd.tp1_201503783.Menu.ANSI_BLUE;
import static edd.tp1_201503783.Menu.ANSI_RED;
import java.util.Scanner;

/**
 *
 * @author edi
 */
public class MenuListaOrdenada {

    Scanner Sn = new Scanner(System.in);
    
    Scanner identificador = new Scanner(System.in);
    Scanner Nombres = new Scanner(System.in);
    Scanner Descripciones = new Scanner(System.in);
    
    
    
    
    
    int Opcion;
    ListaOrdenada LO = new ListaOrdenada();
     
    public void Opciones() {

        System.out.println(ANSI_BLUE + "Bienvenido  a la lista-Ordenada");
        System.out.println(ANSI_BLUE + "Por favor  escoja  la opcion que desea realizar");
        boolean acceso = true;
        int id;
        int indice;
        String Nombre;
        String Descripcion;

        while (acceso) {
            try {
                System.out.println(ANSI_BLACK + "1) Insertar");
                System.out.println(ANSI_BLACK + "2) Eliminar");
                System.out.println(ANSI_BLACK + "3) Regresar");
                System.out.println(ANSI_BLACK + "4) Imprimir");

                Opcion = Sn.nextInt();
                switch (Opcion) {
                    case 1:
                        System.out.println("ingrese el id");
                        id = Sn.nextInt();
                        Sn.nextLine();
                        if(LO.buscarLista(id))
                        {
                            System.out.println(" El elemento ya existe");
                        }else{
                        
                        System.out.println("ingrese el Nombre");
                        Nombre = Sn.nextLine();
                        System.out.println("ingrese el Descripcion");
                        Descripcion = Sn.nextLine();
                        LO.InsertarOrden(id, Nombre, Descripcion);
                        }
                        
                        break;
                    case 2:
                        System.out.println("ingrese el id que desea eliminar");
                        indice = Sn.nextInt();
                        Sn.nextLine();
                        
                        if(!LO.buscarLista(indice)){
                            System.out.println("No existe el elemento ");
                        }else
                        {
                           LO.Eliminar(indice);
                          
                        }
                        break;
                    case 3:
                        acceso = false;
                        break;
                     case 4:
                           LO.RerrorerLista();
                        break;    
                        
                    default:
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                Sn.next();
            }
        } // fin while

    }

}
