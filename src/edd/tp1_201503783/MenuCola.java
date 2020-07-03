/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tp1_201503783;

import Cola.ListaCola;
import static edd.tp1_201503783.Menu.ANSI_BLUE;
import static edd.tp1_201503783.Menu.ANSI_GREEN;
import static edd.tp1_201503783.Menu.ANSI_RED;
import static edd.tp1_201503783.Menu.ANSI_WHITE;
import static edd.tp1_201503783.Menu.ANSI_YELLOW;
import java.util.Scanner;

/**
 *
 * @author edi
 */
public class MenuCola {

    Scanner Sn = new Scanner(System.in);
    int Opcion;
    int id;
    String NombreCompleto = "";
    ListaCola lc = new ListaCola();

    public void Opciones() {
        System.out.println("inserte un dato");

        System.out.println(ANSI_BLUE + "Bienvenido  a la lista-Cola");
        System.out.println(ANSI_BLUE + "Por favor  escoja  la opcion que desea realizar");
        boolean acceso = true;

        while (acceso) {
            try {
                System.out.println(ANSI_GREEN + " 1) Encolar");
                System.out.println(ANSI_GREEN + " 2) Desencolar");
                System.out.println(ANSI_GREEN + " 3) Regresar" + "\n");
                System.out.println(ANSI_BLUE + " Escriba solo numeros de las Opciones");
                System.out.println(ANSI_BLUE + " Eliga una de las opciones");
                Opcion = Sn.nextInt();

                switch (Opcion) {
                    case 1:

                        System.out.println("ingrese el id");
                        id = Sn.nextInt();
                        Sn.nextLine();
                        if (lc.buscarLista(id)) {
                            System.out.println("El elemento Ya existe");
                        } else {
                            System.out.println("ingrese el nombre Completo");
                            NombreCompleto = Sn.nextLine();
                            lc.Encolar(id, NombreCompleto);
                        }

                        //  lc.Imprimir();
                        break;
                    case 2:
                        lc.Desencolar();

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
