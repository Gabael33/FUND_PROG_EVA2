/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p14_ciclo_por;

/**
 *
 * @author Gabael
 */
public class EVA2_P14_CICLO_POR {

    public static void main(String[] args) {
        
        // for --> desde
        //se ejecuta desde un punto a 
        //(punto de inicio; condicion para el termino; manera de avanzarlo (o retorceder))
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
        System.out.println("----------------------------------------");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        //-------------------------------------------------------------------
        //NUMEROS PARES 0 A 100
        
        for(int i = 0; i <= 100; i+=2){
            System.out.print(i + "-");
        }
    }
}
