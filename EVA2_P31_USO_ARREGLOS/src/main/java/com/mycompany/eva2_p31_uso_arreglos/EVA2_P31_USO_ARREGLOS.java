/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_p31_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P31_USO_ARREGLOS {

    public static void main(String[] args) {
        //Generar areglo con valores aleatorios
        //Llenarlo de valores entre 0 y 99
        int[] Arreglo = new int[15];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print("[" + Arreglo[i] + "]");
        }
        System.out.println("");
        System.out.println("Que valor necesitas?");
        int valor = input.nextInt();
        int posi = -1;
//BUSQUEDA
        for (int i = 0; i < Arreglo.length; i++) {
            if (valor == Arreglo[i]) {
                posi = i;
                break;
            }
  
        }
        if (posi != -1) 
            System.out.println("El valor esta en la posicion: " + posi);
         else 
            System.out.println("Valor no encontrado");
        

    }

}
