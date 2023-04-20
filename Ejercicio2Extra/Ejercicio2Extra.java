/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2Extra;

import Entidad.NIF;
import Servicio.NIFService;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NIFService uno = new NIFService();
        NIF dos = new NIF();
        uno.crearNif(dos);
        uno.mostrar(dos);
        
    }
    
}
