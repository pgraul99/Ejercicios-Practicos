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
public class Ejercicio434 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos, palomas, habitaculos;
        
        casos=sc.nextInt();
        for(int i=0; i<casos; i++){
            palomas=sc.nextInt();
            habitaculos=sc.nextInt();
            if(palomas>habitaculos){
                System.out.println("PRINCIPIO");
            }else{
                System.out.println("ROMANCE");
            }
            
        }
    }
}
