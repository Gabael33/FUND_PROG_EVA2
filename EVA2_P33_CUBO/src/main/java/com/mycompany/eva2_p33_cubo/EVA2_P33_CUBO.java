/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p33_cubo;

/**
 *
 * @author Gabael
 */
public class EVA2_P33_CUBO {

    public static void main(String[] args) {
        
        int [][][] cubo = new int [3][4][6];
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo [i][j].length; k++) {
                   cubo [i][j][k] = (int)(Math.random() * 100); 
                }
            }
        }
          for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo [i][j].length; k++) {
                    System.out.print("[" + cubo [i][j][k] + "}");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
        }

    }
    
}
