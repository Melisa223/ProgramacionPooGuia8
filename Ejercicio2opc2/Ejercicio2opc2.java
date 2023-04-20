/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2opc2;

import Entidad.Cafetera2;
import Servicio.CafeteraServicio2;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio2opc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera2 cafe1 = new Cafetera2();
        CafeteraServicio2 cs = new CafeteraServicio2();
        int opc;
        int tamTaza;
        int cafe;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Status");
            System.out.println("6. Salir");
            opc= leer.nextInt();
            
            switch (opc) {
                case 1:
                   cs.llenarCafetera(cafe1);
                   break;
                case 2:                   
                    System.out.println("Ingrese el tamaño de la taza:");
                    tamTaza= leer.nextInt();
                    cs.servirTaza(cafe1, tamTaza);
                    break;
                case 3:
                    cs.vaciarCafetera(cafe1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
                    cafe= leer.nextInt();
                    cs.agregarCafe(cafe1, cafe);
                    break;
                case 5:
                    cs.mostrarCafetera(cafe1);
                    break;
                case 6:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opc!=6);
        
    }    
}
