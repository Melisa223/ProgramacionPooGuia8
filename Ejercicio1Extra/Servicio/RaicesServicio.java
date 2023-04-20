/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    public Raices ingresar(){
        System.out.println("Ingrese el valor a");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor b");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor c");
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }
    
    
    public double getDiscriminante(Raices valores){
        //devuelve el valor del discriminante (double). 
        //El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
        double discriminante = (Math.pow(valores.getB() , 2)) - 4 * valores.getA() * valores.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(Raices valores){
        //tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
        //para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    boolean tieneRaices = true;    
    //double discriminante = (Math.pow(valores.getB() , 2)) - 4 * valores.getA() * valores.getC();  
        if (getDiscriminante(valores)>=0) {
            tieneRaices = true;
        }else{
            tieneRaices = false;
        }      
        return tieneRaices;
    }
    
    public boolean tieneRaiz(Raices valores){
        //tieneRaiz(): devuelve un booleano indicando si tiene una única
        //solución, para que esto ocurra, el discriminante debe ser igual que 0.
    boolean tieneRaiz = true;    
    tieneRaiz = getDiscriminante(valores) == 0;
        System.out.println("La afirmación: Tiene una solución es: " + tieneRaiz);
        return tieneRaiz;
    }  
    
    public void obtenerRaices(Raices valores){
     //d)	Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ 
    //true, imprime las 2 posibles soluciones.
    //((-raiz.getB() + Math.sqrt(obtDiscriminante(raiz))) / (2 * raiz.getA()))
        if (tieneRaices(valores)) {
            System.out.println("La afirmación: Tiene dos soluciones es: " + tieneRaices(valores));
            System.out.println("La primera solución es: ");
            System.out.println(((- valores.getB() + Math.sqrt(getDiscriminante(valores))) / (2 * valores.getA())));
            System.out.println("La segunda solución es: ");
            System.out.println(((- valores.getB() - Math.sqrt(getDiscriminante(valores))) / (2 * valores.getA())));
        }else{           
        }
    }
    
    public void obtenerRaiz(Raices valores){
    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime 
    //una única raíz. Es en el caso en que se tenga una única solución posible.
        if (tieneRaiz(valores)) {
            System.out.println("La única raiz es: ");
            System.out.println((-valores.getB()) / (2 * valores.getA()));
        }else{             
        }
    }
    
    public void calcular(Raices valores){
 //Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
 //y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
 //con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
 //nuestros métodos y en caso de no existir solución, se mostrará un mensaje. 
    RaicesServicio obtener  = new RaicesServicio();
        if (tieneRaices(valores)) {
            obtenerRaices(valores);
        }else if (tieneRaiz(valores)){
            obtenerRaiz(valores);
        }else{
            System.out.println("No tiene raices reales");
        }    
        System.out.println();
        System.out.println("El valor discriminante es: "+ getDiscriminante(valores)); 
    }   
}

    
    

