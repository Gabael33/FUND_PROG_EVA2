/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_p5_operaciones;

/**
 *
 * @author Gabael
 */
public class EVA2_P5_OPERACIONES {

    public static void main(String[] args) {
        
        //Operador ------> SIMBOLO QUE EJECUTA ALGUNA ACCION 
        //SUMA -----> +
        int suma, val1, val2;
        val1 = 100;
        val2 = 200;
        suma = val1 + val2;//Suma arotmetica
        System.out.println("SUMA");
        System.out.println("La suma es:" + suma);//Concatenacion
        
        //Resta
        int resta;
        resta = val1 - val2;
        System.out.println("RESTA");
        System.out.println("La resta es:" + resta);
        
        //MULTIPLICACION
        int multi;
        multi = val1 * val2;
        System.out.println("MULTIPLIACION");
        System.out.println("La multipliacion es:" + multi);
        
        //DIVISION
        int div;
        div = val2 / val1;
        System.out.println("DIVISION");
        System.out.println("La division es:" + div);
        
        int residuo;
        residuo = val1 % val2;
        System.out.println("RESIDUO");
        System.out.println("El residuo es:" + residuo);
        
        double val2Double = 2;
        double resu = val1 / val2Double;
        System.out.println("La division es:" + resu);
        
        resu = 11 / 2.0;
        System.out.println("El resultado de 11/2.0 es:" + resu);
        //int resu2 = 11/2.0 // hay persisa de datos
        
        //POTENCIAS
        // En este caso no hay un operador
        double potencia = Math.pow (3,3);
        System.out.println("POTENCIA");
        System.out.println("La potencia es:" + potencia);
        
        //RAIZ
        // No hay operadores
        double raiz = Math.pow (100, 0.5);
        System.out.println("RAIZ");
        System.out.println("La raiz es:" + raiz);
        
        //Precedencia de operaciones
        int resuOp, x =3, y =2, z = 5;
        resuOp = (x*z) + (x+y) / 2 - (y -x);
                //(15) + (6)/2 - (-3)
                //15 + 3 -(-3)
                //15 + 3 + 3
                //21
                
        System.out.println("El resultado es:" + resuOp);
        
        //Formula general
        double resuFG, a = 3, b = 9, c = 3 ;
        resuFG = ((-b)- Math.pow(((b*b) - (4*a*c)), 0.5))/(2*a);
        System.out.println("El resultado es:" + resuFG);        
                
    }
}
