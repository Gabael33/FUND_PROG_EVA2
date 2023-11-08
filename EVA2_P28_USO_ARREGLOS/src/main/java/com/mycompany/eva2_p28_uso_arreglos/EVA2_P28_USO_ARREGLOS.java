/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P28_USO_ARREGLOS {

    public static void main(String[] args) {
        int cant;
        int [] califas;
        Scanner input = new Scanner (System.in);
        System.out.println("Cantidad de calificaciones que quieres capturar:");
        cant = input.nextInt();
        califas  = new int [cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion:");
            califas[i] = input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.println("[" + califas [i] + "]");
        }
    }
}
