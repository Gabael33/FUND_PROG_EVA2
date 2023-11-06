/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Introduce un numero:");
        num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------");
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
}
