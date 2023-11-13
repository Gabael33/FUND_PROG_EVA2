/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.e10_eva2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class E10_EVA2 {

    public static void main(String[] args) {
        String cadena;
        String caracter[] = new String[10];
        int contador = 0;
        String mensaje = "";

        caracter[0] = "0";
        caracter[1] = "1";
        caracter[2] = "2";
        caracter[3] = "3";
        caracter[4] = "4";
        caracter[5] = "5";
        caracter[6] = "6";
        caracter[7] = "7";
        caracter[8] = "8";
        caracter[9] = "9";

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el texto:");
        cadena = input.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            contador = 0;
            for (int j = 0; j < 10; j++) {

                if (cadena.charAt(i) == caracter[j].toString().charAt(0)) {

                    contador = 1;
                    continue;

                }
            }
            if (contador == 0) {

                mensaje = " no";
                continue;
            }

        }
        System.out.println("El numero es" + mensaje + " valido");
    }
}
