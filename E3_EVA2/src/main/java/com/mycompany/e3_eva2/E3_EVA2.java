/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e3_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E3_EVA2 {

    public static void main(String[] args) {
        int num;
        int sum = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el numero donde quiere que acabe la sumatoria:");
        num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
           sum = sum + i;
            
        }
        System.out.println("La sumatoria del 1 al" + " " + num + " " + "es:" + " " + sum);
    }
}
