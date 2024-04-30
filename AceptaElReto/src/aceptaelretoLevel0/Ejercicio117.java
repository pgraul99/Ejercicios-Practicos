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
public class Ejercicio117 {
    



    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        int n=Integer.parseInt(sc.nextLine());
        String [] nombres= new String[n];
        
        for(int i=0; i<n; i++){
            nombres[i] = sc.nextLine();
        }
        for(String str: nombres){
            System.out.println(str.replaceAll("Soy ", "Hola, ")+".");
        }       
    }
    
    
    
}

