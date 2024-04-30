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
public class Ejercicio532 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String pesoProducto, pesoTotal;
        int i=0;
        int n=Integer.parseInt(sc.nextLine());

        while(n>i){
            pesoProducto=sc.next();
            pesoTotal=sc.next();
            int r=Integer.parseInt(pesoProducto);
            int s=Integer.parseInt(pesoTotal);
            
            if((1 <= r && r <= 1000) && (1 <= s && s <= 1000)){
                System.out.println(s-r);
            }
            
            i++;
        }  
    
    
}
}
