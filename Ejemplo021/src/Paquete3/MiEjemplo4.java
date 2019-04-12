/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class MiEjemplo4 {
    public static void main(String[] args){
    String nombrePersona;
    String apellidoPersona;
    String ciudad;
    int edad;
    int nota1;
    int nota2;
    double promedio;
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese su nombre por favor");
    nombrePersona = entrada.nextLine();
    
    System.out.println("Ingrese su apellido por favor");
    apellidoPersona = entrada.nextLine();
    
    System.out.println("Ingrese su edad por favor");
    edad = entrada.nextInt();
    entrada.nextLine();// ESTO ES UNA LIMPIEZA DEL BUFFER DE ENTRADA
    
    System.out.println("Ingrese sus notas por favor");
    nota1 = entrada.nextInt();
    entrada.nextLine();
    nota2 = entrada.nextInt();
    entrada.nextLine();
    
    promedio = (nota1+nota2)/2;
    System.out.println("Ingrese su ciudad por favor");
    ciudad = entrada.nextLine();

    System.out.printf("Me llamo: %s %s\nMi ciudad es: %s\nMi edad es: %s\nMis notas son: %s y %s\nMi promedio es: %s",
            nombrePersona, apellidoPersona, ciudad, edad, nota1, nota2, promedio);
    }
}
