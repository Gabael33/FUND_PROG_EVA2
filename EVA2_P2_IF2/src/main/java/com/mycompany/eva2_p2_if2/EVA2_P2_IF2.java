/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p2_if2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P2_IF2 {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        //Declaramos
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese valor1:");
        valor1 = input.nextInt();
        System.out.println("Ingrese valor2:");
        valor2 = input.nextInt();
        //Capturamos
        
        if (valor1 > valor2) {
            System.out.println("El valor mas grande es:" + " " + valor1);
        } else { // cuando el resultado es falso
            if (valor1<valor2){
                System.out.println("El valor mas grande es" + " " + valor2);
            }else{
                System.out.println("Ambos son iguales");
            }
        }
    }
}
