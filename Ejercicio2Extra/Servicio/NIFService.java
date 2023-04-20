/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class NIFService {
    Scanner leer = new Scanner(System.in); 
    
    public void crearNif(NIF dni){        
    //Método crearNif(): le pide al usuario el DNI y con ese DNI 
    //calcula la letra que le corresponderá. Una vez calculado, le 
    //asigna la letra que le corresponde según
    
    System.out.println("Ingrese su número de DNI");
    dni.setDni(leer.nextInt()); 
    }    

    
    public void mostrar(NIF uno){
    String Letra1="";
    int calLetra = ((uno.getDni()%23));
        System.out.println(calLetra);
    String frase = "TRWAGMYFPDXBNJZSQVHLCKE";  
    
    
    for (int i = 0; i < frase.length(); i++) {   
     if (i == calLetra) {
        uno.setLetra(frase.substring(i, i+1));
        Letra1 = uno.getLetra();
    }    
        }
   
    //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, 
    //un guion y la letra en mayúscula; por ejemplo: 00395469-F).     
    System.out.println("El NIF creado es: " + uno.getDni() + "-" + Letra1);
    
    }
            
     
    
}
