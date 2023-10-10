/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P3_NUMEROS_PARES {

    public static void main(String[] args) {
        int valor;
        int residuo;
        //Declaramos
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("Ingrese el valor:");
        valor = input.nextInt();
        //Capturamos
        
        residuo = valor % 2;
        // Hacemos la operacion del residuo
        
        if (residuo == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero no es par, es impar");
        }
    }
}
