/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e7_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E7_EVA2 {

    public static void main(String[] args) {
        int num, max = 0, min = 0;
        int primero = 0;
        Scanner input = new Scanner (System.in);
        


        do{
            System.out.println("Ingrese un numero:");
            num = input.nextInt();
            if(primero == 0){
                max = num;
                min = num;
                primero = primero + 1;
            
            }
            if (num >= 0){
                if( num < min){
                min = num;
                }
                if (num > max){
                max = num;
            }
            }
        }while (num >= 0);
        
        System.out.println("El numero minimo es: " + min);
        System.out.println("El numero maximo es: " + max);
        
          
         
    }
}
