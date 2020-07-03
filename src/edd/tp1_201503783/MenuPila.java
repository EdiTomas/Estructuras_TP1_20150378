/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tp1_201503783;

import Pila.ListaPila;
import static edd.tp1_201503783.Menu.ANSI_BLUE;
import static edd.tp1_201503783.Menu.ANSI_PURPLE;
import static edd.tp1_201503783.Menu.ANSI_RED;
import java.util.Scanner;

/**
 *
 * @author edi
 */
public class MenuPila {

    Scanner Sn = new Scanner(System.in);
    int Opcion;
    ListaPila Lp = new ListaPila();
     

    public void Opciones() {

        System.out.println(ANSI_BLUE + "Bienvenido  a la lista-Pila");
        System.out.println(ANSI_BLUE + "Por favor  escoja  la opcion que desea realizar");
        boolean acceso = true;
        int id;
        String Nombre;
        String Apellido;
        while (acceso) {
            try {
                System.out.println(ANSI_PURPLE + "1) Push");
                System.out.println(ANSI_PURPLE + "2) Pop");
                System.out.println(ANSI_PURPLE + "3) Regresar");

                Opcion = Sn.nextInt();
                switch (Opcion) {
                    case 1:
                        System.out.println("ingrese el id");
                        id = Sn.nextInt();
                        Sn.nextLine();
                        if (Lp.buscarLista(id)) {
                            System.out.println("El elemento ya existe");
                        } else {
                            System.out.println("ingrese el Nombre");
                            Nombre = Sn.nextLine();
                            System.out.println("ingrese el Apellido");
                            Apellido = Sn.nextLine();
                            Lp.Push(id, Nombre, Apellido);
                        }
                        break;
                    case 2:
                        Lp.Pop();
                        break;
                    case 3:
                        acceso = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                Sn.next();
            }
        } // fin while

    }

}
