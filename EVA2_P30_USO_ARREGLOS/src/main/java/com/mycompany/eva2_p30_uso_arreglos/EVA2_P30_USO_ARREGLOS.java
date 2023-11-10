/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P30_USO_ARREGLOS {

    public static void main(String[] args) {
        String [] ListaProd= new String [10];
        ListaProd [0] = "Tacos";
        ListaProd [1] = "Tortas";
        ListaProd [2] = "Tamales";
        ListaProd [3] = "Tlacoyas";
        ListaProd [4] = "Tlayudas";
        ListaProd [5] = "Tampiquenas";
        ListaProd [6] = "Tortas ahugadas";
        ListaProd [7] = "Tchilaquiles";
        ListaProd [8] = "T-bone";
        ListaProd [9] = "Tripas";
        
        double [] ListaPrecios = {20, 40, 15, 50, 30, 54, 60, 200, 400, 10};
        
        System.out.println("-----Menu-----");
        for (int i = 0; i < ListaProd.length; i++) {
            System.out.println( i + "- " + ListaProd[i] + ": $" + ListaPrecios[i]);
            
        }
        Scanner input = new Scanner (System.in);
        int orden, cant;
        System.out.println("Que deseas ordenar?");
        orden = input.nextInt();
        System.out.println("Cuantas ordenes?");
        cant = input.nextInt();
        System.out.println("Tu total es: " + (cant * ListaPrecios[orden]));
        
    }
}
