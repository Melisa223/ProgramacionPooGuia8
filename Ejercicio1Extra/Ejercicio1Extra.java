/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Extra;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    RaicesServicio uno = new RaicesServicio();
    Raices dos = uno.ingresar();
    uno.calcular(dos);
    
    }  
}
