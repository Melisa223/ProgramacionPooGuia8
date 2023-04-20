/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Meli
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int mayores = 0;
        int menores = 0;
        int menor=0;
        int ideal=0;
        int mayor=0;
        

        PersonaServicio crear = new PersonaServicio();
        Persona uno = crear.crearPersona();
        crear.esMayorDeEdad(uno);
        crear.calcularIMC(uno);
        Persona dos = crear.crearPersona();
        crear.esMayorDeEdad(dos);
        crear.calcularIMC(dos);
        Persona tres = crear.crearPersona();
        crear.esMayorDeEdad(tres);
        crear.calcularIMC(tres);
        Persona cuatro = crear.crearPersona();
        crear.esMayorDeEdad(cuatro);
        crear.calcularIMC(cuatro);

        int IMCs[] = {crear.calcularIMC(uno), crear.calcularIMC(dos), crear.calcularIMC(tres), crear.calcularIMC(cuatro)};
        for (int i = 0; i < IMCs.length; i++) {
            switch (IMCs[i]) {
                case -1:
                    menor++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:  
                    mayor++;
                    break;            
            }
        }
        int edades[] = crear.edades(uno, dos, tres, cuatro);
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > 18) {
                mayores++;
            } else {
                menores++;
            }
        }
        
        System.out.println("En el grupo de personas hay: " + mayores +" mayores de edad.");
        System.out.println("El porcentaje de personas mayores es: " + (mayores*100/4));
        System.out.println("En el grupo de personas hay: " + menores +" menores de edad.");
        System.out.println("El porcentaje de personas menores es: " + (menores*100/4));
        System.out.println("En el grupo de personas hay: " + menor + " debajo de su peso ideal.");
        System.out.println("El porcentaje de personas con bajo peso: " + (menor*100/4));
        System.out.println("En el grupo de personas hay: " + ideal +" con el peso ideal.");
        System.out.println("El porcentaje de personas con el peso ideal: " + (ideal*100/4));
        System.out.println("En el grupo de personas hay: " + mayor + "con sobre peso.");
        System.out.println("El porcentaje de personas con sobre peso: " + (mayor*100/4));
        
        
    }
}
