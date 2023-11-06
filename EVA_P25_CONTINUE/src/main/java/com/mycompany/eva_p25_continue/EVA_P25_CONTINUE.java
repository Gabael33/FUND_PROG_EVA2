/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_p25_continue;

/**
 *
 * @author Gabael
 */
public class EVA_P25_CONTINUE {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 7)
                continue;//Interrumpe por un momento
            
            System.out.print(i + "-");
        }
        
        System.out.println("");
        System.out.println("-----------------------------------------");
        for (int i = 1; i <= 15; i++) {
            if (i == 7)
                break;//Hasta aqui se acaba
            
            System.out.print(i + "-");
        }
            //Imprimimos numeros pares del 1 al 20
            System.out.println("");
            System.out.println("-----------------------------------------");
            for (int i = 1; i <= 20; i++) {
                if((i % 2) != 0)
                    continue;
                System.out.print(i + "-");
                
            }
        }
    }

