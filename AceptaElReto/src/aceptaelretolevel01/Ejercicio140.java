/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretolevel01;

import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        while (true) {
            int numero = Integer.parseInt(sc.nextLine());
            if (numero > 0 && numero < Math.pow(10, 9)) {
                suma(numero);
            } else {
                break;
            }
        }
    }

    public static void suma(int n) {
        int suma=0;
        String res=Integer.toString(n);
        for(int i = 0; i < res.length(); i++){
            int caracter=Integer.parseInt(""+res.charAt(i));
            suma+=caracter;
            
            if(i==res.length()-1){
                System.out.print(caracter + " = " + suma);
            }else{
                System.out.print(caracter + " + ");
            }
        }
        System.out.println("");
        

    }
}
