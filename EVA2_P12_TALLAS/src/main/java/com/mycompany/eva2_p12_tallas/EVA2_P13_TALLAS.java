/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p12_tallas;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P13_TALLAS {

    public static void main(String[] args) {
        int talla;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el valor numerico de talla:");
        talla = input.nextInt();
        
        switch (talla){
            case 29:
                System.out.println("small");
                break;
            case 42:
                System.out.println("medium");
                break;
            case 44:
                System.out.println("large");
                break;
            case 48:
                System.out.println("large");
                break;
            default:
                System.out.println("El numero" + " " + talla + " " + "no es una talla valida!!");
                
                    
        }
        
                
                
    }
}
