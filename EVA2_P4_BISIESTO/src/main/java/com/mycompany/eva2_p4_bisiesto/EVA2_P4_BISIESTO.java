/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P4_BISIESTO {

    public static void main(String[] args) {
        int year, residuo;
        //Declaramos variables
        
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("Ingrese el año:");
        year = input.nextInt();
        //Capturamos informacion
        
        residuo = year % 4;
        //asignamos valor
        
        if (residuo == 0){//verdad: año divisible entre 4
            residuo = year % 100;
            if(residuo == 0){
                residuo = year % 400;
                if (residuo == 0){
                    System.out.println("Es un año bisisesto");
                }else 
                    System.out.println("No es un año bisisesto");
            }else
                System.out.println("Es un año bisisesto");
        }else
            System.out.println("No es un año bisiesto");
        
    }
}
