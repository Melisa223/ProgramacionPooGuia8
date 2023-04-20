/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class CuentaBancariaServicio {
  Scanner leer = new Scanner(System.in);  
    public CuentaBancaria crearCuenta(){         
        System.out.println("Ingrese su numero de cuenta:"); 
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        int dni = leer.nextInt();
        System.out.println("Ingrese su salgo: ");
        double saldo = leer.nextDouble();
        return new CuentaBancaria(numCuenta,dni,saldo);
    }
    
    public double ingresar(CuentaBancaria cuenta1){
        
        double saldo = cuenta1.getSaldoActual();
        System.out.println("Ingrese el monto que desea depositar: ");
        double ingreso = leer.nextDouble();
        cuenta1.setSaldoActual(saldo + ingreso);
        System.out.println("Su saldo es: " + (saldo + ingreso));
        return cuenta1.getSaldoActual();
    }
   
    public double retirar(CuentaBancaria cuenta1){
        double saldo = cuenta1.getSaldoActual();
        System.out.println("Ingrese el monto que desea retirar: ");
        double retiro = leer.nextDouble();
        if (retiro>saldo) {
        cuenta1.setSaldoActual(0);
            System.out.println("Como se nota que estamos a fin de mes");
        }else{           
        cuenta1.setSaldoActual(saldo - retiro);
            System.out.println("Su saldo es: " + (saldo - retiro));
        }        
        return cuenta1.getSaldoActual();
    }
    
    public double extraccionRapida(CuentaBancaria cuenta1){
        double saldo = cuenta1.getSaldoActual();
        
        System.out.println("Ingrese un monto a retirar: ");
        double retiroRap = leer.nextDouble();
        do {
            System.out.println("Ingrese un monto valido: ");
            retiroRap = leer.nextDouble();            
        } while (retiroRap > (saldo*0.20));
        
        cuenta1.setSaldoActual(saldo-retiroRap);
        System.out.println("El retiro fue exitoso. Su saldo actual es: " + (saldo-retiroRap));
        return cuenta1.getSaldoActual();
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){        
         System.out.println("Su saldo actual es: " + cuenta1.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta1){        
         System.out.println("Su numero de cuenta es: " + cuenta1.getNumeroCuenta());
         System.out.println("Su DNI es: " + cuenta1.getDniCliente());
         System.out.println("Su saldo es: " + cuenta1.getSaldoActual());
        
         
    }
    
}
