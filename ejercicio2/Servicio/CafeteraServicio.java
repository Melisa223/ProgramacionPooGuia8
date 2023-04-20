/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class CafeteraServicio {
    public Cafetera llenarCafetera(){
    Cafetera sc = new Cafetera();
    sc.setCantidadActual(sc.getCapacidadMaxima());
    return sc;
    }
    public Cafetera servirTaza(){
    int taza;
    Cafetera sc = new Cafetera();
    Scanner leer = new Scanner(System.in);
    taza = leer.nextInt();
        if (sc.getCantidadActual()>=taza) {
            sc.setCantidadActual(sc.getCantidadActual()-taza);
        } else {
            System.out.println("La taza quedó en" + sc.getCantidadActual());
            sc.setCantidadActual(0);
           
        }
    return sc;
    } 
}

