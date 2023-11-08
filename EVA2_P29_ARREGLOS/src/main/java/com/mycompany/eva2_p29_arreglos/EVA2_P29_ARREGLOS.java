/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p29_arreglos;

/**
 *
 * @author Gabael
 */
public class EVA2_P29_ARREGLOS {

    public static void main(String[] args) {
        int [] arreglo = new int [7];
        //vamos a llenar ese elemento aleatorio entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo [i] + "]");

        }
    }
}
