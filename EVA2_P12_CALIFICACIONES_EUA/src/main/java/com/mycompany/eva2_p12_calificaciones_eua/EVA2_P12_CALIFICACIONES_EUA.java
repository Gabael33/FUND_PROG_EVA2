/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p12_calificaciones_eua;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P12_CALIFICACIONES_EUA {

    public static void main(String[] args) {
        int califaN;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el valor numerico de la calificacion:");
        califaN = input.nextInt();
        
        if ((califaN >= 0) && (califaN <= 100)){
            System.out.println("El numero" + " " + califaN + " " + "es una calificacion valida!!");
            
            if ((califaN >= 90)&&(califaN <= 100))
                System.out.println("A");
            else if((califaN >= 80)&&(califaN <= 89))
                System.out.println("B");
            else if((califaN >= 70)&&(califaN <= 79))
                System.out.println("C");
            else if((califaN >= 60)&&(califaN <= 69))
                System.out.println("D");
            else if(califaN < 60)
                System.out.println("F");
            
            
        }else
            System.out.println("El numero" + " " + califaN + " " + "no es una calificacion valido!!");
     
        }
    }

