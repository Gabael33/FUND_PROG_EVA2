/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e4_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E4_EVA2 {

    public static void main(String[] args) {
        int num;
        String fin;
        
        Scanner input = new Scanner (System.in);
        
     
        
        do{
            System.out.println("Ingrese el numero para asignarle si es positivo, negativo o neutro:");
        num = input.nextInt();
        if (num == 0)
            System.out.println("El numero " + num + " es un numero neutro");
        else if (num < 0)
            System.out.println("El numero " + num + " es un numero negativo");
        else{
            System.out.println("El numero " + num + " es un numero postivo");
        }
        
        System.out.println("Desea acabar el programa?");
        fin = input.next();
            
        }while (fin.equals("no"));
        
        System.out.println("Fin del programa");
        
    }
    
}
