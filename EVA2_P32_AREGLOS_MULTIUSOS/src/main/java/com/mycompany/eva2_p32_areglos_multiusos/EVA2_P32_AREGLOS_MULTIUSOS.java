/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p32_areglos_multiusos;

/**
 *
 * @author Gabael
 */
public class EVA2_P32_AREGLOS_MULTIUSOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int [][] matriz = new int [3][4];
        
        matriz [1][3] = 100;
        System.out.println("matriz[1][3] = " + matriz [1][3]);
        //-------------------
        
        //Llenar con valores aleatorios la matriz
        //FILAS ----> Primer dimension
        for (int i = 0; i < matriz.length; i++) {
            //Columnas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            //Columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("{" + matriz[i][j] +"}");
            }
            System.out.println("");
        }
    }
}
