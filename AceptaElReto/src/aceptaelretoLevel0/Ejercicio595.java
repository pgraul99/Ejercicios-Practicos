/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretoLevel0;


import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio595 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double n=Double.parseDouble(sc.nextLine());
      double i=0;

        while(n>i){
            double numero=Double.parseDouble(sc.nextLine());
            if((100 <= numero && numero <= 999.999)){
                String desc=Double.toString(numero);
                double numero1=Double.parseDouble(desc);
                System.out.println(numero1);
            }
            
            i++;
        }  
    
    
}
}