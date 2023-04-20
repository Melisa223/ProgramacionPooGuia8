/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera2;

/**
 *
 * @author Meli
 */
public class CafeteraServicio2 {
     
    public void llenarCafetera(Cafetera2 uno){
       int cap = uno.getCapacidadMaxima();
       uno.setCantidadActual(cap);
       
    }
    public int servirTaza(Cafetera2 uno, int tamTaza){
        int actual= uno.getCantidadActual();
        if (actual<tamTaza) {
            System.out.println("La taza no se lleno completamente");
            System.out.println("En la taza se sirvió; " + (actual));
            System.out.println("Falto para llenar la taza: " + (tamTaza-actual));
            uno.setCantidadActual(0);           
        } else {
            System.out.println("Se lleno la taza");
            uno.setCantidadActual(actual-tamTaza);           
        }  
        return uno.getCantidadActual();        
    }   
    public void vaciarCafetera(Cafetera2 uno){
        uno.setCantidadActual(0);
    }
    
    public int agregarCafe(Cafetera2 uno, int cafe){
      int actual= uno.getCantidadActual();
      uno.setCantidadActual(actual + cafe);
       return uno.getCantidadActual();
    }
   
    public void mostrarCafetera(Cafetera2 uno){
        System.out.println(uno.toString());
    }
}
