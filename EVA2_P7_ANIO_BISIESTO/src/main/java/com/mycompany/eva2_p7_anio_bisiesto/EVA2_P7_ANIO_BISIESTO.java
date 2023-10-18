/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P7_ANIO_BISIESTO {

    public static void main(String[] args) {
        int year, resi4, resi100, resi400;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el año:");
        year = input.nextInt();
        
        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        
        //&& = AND
        //|| = OR
        //! = operador de negacion
        // (!=) = operador diferente 
        
        if ((resi4 == 0) && (resi100 != 0)||(resi400 == 0)){
        System.out.println("El año" + " " + year + " " + "es binario.");
    }else{
        System.out.println("El año" + " " + year + " " + "no es binario");    
            }
            
        
        
    }
}
