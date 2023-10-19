/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p10_carreras;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P10_CARRERAS {

    public static void main(String[] args) {
        String ISCarreras;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese las iniciales de su carrera:");
        ISCarreras = input.nextLine();
        
        switch (ISCarreras){
            case "ISC":
                System.out.println("INGENERIA EN SISTEMAS COMPUATACIONALES");
                break;
            case "ARQ":
                System.out.println("ARQUITECTURA");
                break;
            case "IINF":
                System.out.println("INGENERIA INFORMATICA");
                break;
            case "II":
                System.out.println("INGENERIA INDUSTRIAL");
                break;
            case "IDI":
                System.out.println("INGENERIA EN DISEÑO INDUSTRIAL");
                break;
            case "LA":
                System.out.println("LICENCIATURA EN ADMINISTRACION");
                break;
            case "IGE":
                System.out.println("INGENERIA EN GESTION EMPRESARIAL");
                break;
            default: 
                System.out.println("No hay una carrera con esas iniciales.");

                
        }
    }
}
