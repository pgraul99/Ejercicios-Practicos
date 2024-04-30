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
public class Ejercicio413 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos, alto, ancho, blancas, negras;
        
        casos=sc.nextInt();
        for(int i=0; i<casos; i++){
            alto=sc.nextInt();
            ancho=sc.nextInt();
            int resultado=alto*ancho;
            if(resultado%2==0){
                blancas=resultado/2;
                negras=resultado/2;
            }else{
                blancas=resultado/2 +1;
                negras=resultado/2;
            }
            System.out.println(blancas+" "+negras);
        }
    }
}
