/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p27_arreglos;

/**
 *
 * @author Gabael
 */
public class EVA2_P27_ARREGLOS {

    public static void main(String[] args) {
        //Decalaramos un arreglo que alamacena 10 enteros
        //acceso de arreglos aleatorio
        //se accede a los valores a traves de un INDICE
        //Los valores almacenados tienen una direccion:
        //el primer elemento esta en la posiciob 0
        //el ultimo esta en la posicion n-1, donde N es el tamanio del arreglo
        int [] arregloEnteros = new int [10];
        
       //ACCEDER VALORES DEL ARREGLO
       arregloEnteros[0] = 100;
       arregloEnteros[1] = 200;
       arregloEnteros[2] = 300;
       arregloEnteros[3] = 400;
       arregloEnteros[4] = 500;
       arregloEnteros[5] = 600;
       arregloEnteros[6] = 700;
       arregloEnteros[7] = 800;
       arregloEnteros[8] = 900;
       arregloEnteros[9] = 1000;
       
        System.out.println("Valor en la posicion 0: " + arregloEnteros[0]);
        
        String [] arregloCadena = new String [5];
        
        arregloCadena[0] = "HOLA";
        arregloCadena[1] = " ";
        arregloCadena[2] = "MUNDO";
        arregloCadena[3] = " ";
        arregloCadena[4] = "CRUEL!";
        
        int [] arreglo = {5, 4, 3, 2, 1};
        System.out.println("Posicion arreglo [3]: " + arreglo[3]);
    }
}
