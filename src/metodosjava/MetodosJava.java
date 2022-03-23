/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosjava;

/**
 *
 * @author Tony
 */

import java.util.Scanner; //libreria para introducir datos desde teclado
public class MetodosJava {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int numero1,numero2,resultado;
        System.out.println("Introduce el primer numero:");//solicita al usuario un numero
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");//solicita al usuario un numero
        numero2 = sc.nextInt();
        
        resultado = sumar(numero1,numero2);
        System.out.println("la suma es : " + resultado);
    }
    
    //declarar metodo sumar
    public static int sumar (int a ,int b){
        int c;
        c= a+b;
        return c;
    }
}
