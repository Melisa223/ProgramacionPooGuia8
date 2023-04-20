/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
       Scanner leer = new Scanner(System.in);
       CuentaBancariaServicio cuenta1 = new CuentaBancariaServicio();
       CuentaBancaria uno = cuenta1.crearCuenta();
       int opc=0;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ingresar");
            System.out.println("2. Extraer");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            opc= leer.nextInt();
            
            switch (opc) {
                case 1:
                  cuenta1.ingresar(uno);
                   break;
                case 2:                   
                  cuenta1.retirar(uno);
                    break;
                case 3:
                  cuenta1.extraccionRapida(uno);
                    break;
                case 4:
                  cuenta1.consultarSaldo(uno);
                    break;
                case 5:
                  cuenta1.consultarDatos(uno);
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opc!=6);
        
    }    
       
}
   

