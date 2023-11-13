/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e9_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E9_EVA2 {

    public static void main(String[] args) {
        String cadena;
        char caracter;
        int Ccaracter = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el texto");
        cadena = input.nextLine();
        System.out.println("Ingrese el caracter que deseas");
        caracter = input.next().charAt(0);
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                Ccaracter = Ccaracter + 1;
            }
            
        }
        System.out.println("La cantidad de veces que se repite el caracter " + caracter + " son " + Ccaracter + " veces.");
    }
}
