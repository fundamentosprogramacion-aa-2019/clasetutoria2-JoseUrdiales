/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Jose Luis
 */
public class MiEjemplo2 {
    public static void main(String[] args){
    String nombrePersona;
    String apellidoPersona;
    int edad;
    
    nombrePersona = "José Luis";
    apellidoPersona = "Urdiales Cuenca";
    edad = 20;
    /**
    System.out.println("Mi Nombre es: "+nombrePersona+"\n\n\tMi Apellido" 
            +" es: "+apellidoPersona);
    */
    System.out.printf("Mi nombre es: %s\n\n\t Mi apellido es: %s\nMi edad es: %s", 
            nombrePersona, apellidoPersona, edad);
    }
    
}
