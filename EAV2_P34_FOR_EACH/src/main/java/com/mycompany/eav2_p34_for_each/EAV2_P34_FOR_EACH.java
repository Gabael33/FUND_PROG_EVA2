/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eav2_p34_for_each;

/**
 *
 * @author Gabael
 */
public class EAV2_P34_FOR_EACH {

    public static void main(String[] args) {
        //FOR EACH ---> FOR PARA RECORRER ARREGLOS
        //FOR EACH --> FOR PARA ARREGLOS
        
        int arreglo [] = new int [10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int)(Math.random()*100);
        }
        for (int valor : arreglo){
            System.out.println("[" + valor + "]");
        }
        System.out.println("");
        String mensaje [] = {"hola", " ", "mundo", " ", "cruel!!!" };
        for (String valor : mensaje){
            System.out.println(valor);
        }
    }
}
