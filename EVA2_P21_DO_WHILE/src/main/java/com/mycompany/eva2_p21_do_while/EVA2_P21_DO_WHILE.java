/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p21_do_while;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P21_DO_WHILE {

    public static void main(String[] args) {
        int valor;
        Scanner input = new Scanner (System.in);
        System.out.println("Adivina el numero oculto");
       
        do{
            System.out.println("Introduce el valor:");
            valor = input.nextInt();
        }while(valor != 100);
        System.out.println("Adivinaste!!");
    }
}
