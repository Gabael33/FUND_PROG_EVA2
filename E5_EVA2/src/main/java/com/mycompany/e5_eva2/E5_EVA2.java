/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e5_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E5_EVA2 {

    public static void main(String[] args) {
        int num, exponente, resultado = 1;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Cual es la base del numero exponenciado:");
        num = input.nextInt();
        System.out.println("Cual es el exponente:");
        exponente = input.nextInt();
        
        for (int i = 1; i <= exponente; i++) {
           resultado = (resultado * num) ;
            
        }
        System.out.println("El resultado del " + num + " con un exponente elevado a la " + exponente + " es igual a " + resultado); 
    }
}
