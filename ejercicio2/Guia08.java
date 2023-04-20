/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Meli
 */
public class Guia08 {

    /**
     * @param args the command line arguments
     */
   
      public static void main(String[] args) {
   
    CafeteraServicio sc = new CafeteraServicio();
    Cafetera cafe1 = sc.llenarCafetera();
        System.out.println(cafe1);
    Cafetera taza1 = sc.servirTaza();
    
    
    }
    
}  // TODO code application logic here
 