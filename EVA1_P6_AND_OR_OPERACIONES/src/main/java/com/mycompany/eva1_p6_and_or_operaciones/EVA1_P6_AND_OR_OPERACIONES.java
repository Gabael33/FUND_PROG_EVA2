/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_p6_and_or_operaciones;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA1_P6_AND_OR_OPERACIONES {

    public static void main(String[] args) {
        int califa;
        
        Scanner input = new Scanner (System.in);
        
        //Capturamos la calificacion
        System.out.println("Ingrese su calificacion:");
        califa = input.nextInt();
        
        //Validacion de calificacion
        //Vamois evaluar la informacion que nos dieron
        if((califa >= 0)&&(califa <= 100)){
            System.out.println("La calificacion" + " " + califa + " " + "es valida.");
            if (califa >= 70)
                System.out.println("Acreditas!!");
            else
                System.out.println("No acreditas!!");
        }else {
            System.out.println("La calificacion" + " " + califa + " " + "no es valida.");
        }
        
        
    }
}
