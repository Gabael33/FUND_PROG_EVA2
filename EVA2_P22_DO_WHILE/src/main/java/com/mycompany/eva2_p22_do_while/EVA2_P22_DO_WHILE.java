/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p22_do_while;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA2_P22_DO_WHILE {
    final static String NOMBRE_USUARIO = "ADMIN";
    final static String PASSWORD = "ADMIN";

    public static void main(String[] args) {
        String usuario;
        String psw;
        Scanner input = new Scanner (System.in);
        
        do{
            System.out.println("Introduce el usuario:");
            usuario = input.nextLine();
            System.out.println("Introduce el password:");
            psw = input.nextLine();
        }while(!usuario.equals(NOMBRE_USUARIO) || (!psw.equals(PASSWORD)));
        
        System.out.println("Bienvenido al sistema!!");
        
    }
}
