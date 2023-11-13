/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e8_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E8_EVA2 {

    public static void main(String[] args) {
        String palabra = "nada";
        
        Scanner input = new Scanner (System.in);
        
        do{
            System.out.println("Introduce la letra que deseas saber si es vocal o consonante");
            palabra = input.nextLine();
            switch(palabra){
                case "a":
                    System.out.println("Es vocal");
                    continue;
                case "e":
                    System.out.println("Es vocal");
                    continue;
                case "i":
                    System.out.println("Es vocal");
                    continue;
                case "o":
                    System.out.println("Es vocal");
                    continue;
                case "u":
                    System.out.println("Es vocal");
                    continue;
                default:
                    System.out.println("Es consonante");
                    continue;
            }
                
        
        }while(!palabra.equals(" "));
        System.out.println("Fin del programa");
    }
}
