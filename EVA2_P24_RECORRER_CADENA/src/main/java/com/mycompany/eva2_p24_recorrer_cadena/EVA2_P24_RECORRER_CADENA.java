/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p24_recorrer_cadena;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P24_RECORRER_CADENA {

    public static void main(String[] args) {
        String cade;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el texto:");
        cade = input.nextLine();
        for (int i = 0; i < cade.length(); i++) {
            System.out.println(cade.charAt(i));
        }
    }
}
