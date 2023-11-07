/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e1_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E1_EVA2 {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el numero menor:");
        num1 = input.nextInt();
        System.out.println("Ingrese el numero mayor:");
        num2 = input.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            
            System.out.print(i + "-");
        }
    }
}
