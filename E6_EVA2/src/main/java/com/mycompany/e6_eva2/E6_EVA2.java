/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e6_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E6_EVA2 {

    public static void main(String[] args) {
        int num, residuo;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el numero que quiere convertir a binario:");
        num = input.nextInt();
       
        System.out.println("El numero binario es: ");
        System.out.println("El numero se lee de derecha a izquierda (<-------)");
      do{
          residuo = num % 2;
          num = num/2;
          System.out.print(residuo);
         
      
      } while (num > 0);
        
        
        
        
    }
}
