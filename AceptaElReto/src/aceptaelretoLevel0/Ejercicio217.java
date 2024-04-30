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
public class Ejercicio217 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n=Integer.parseInt(sc.nextLine());
            if(n!=0){
                if(n%2==0){
                    System.out.println("DERECHA");
                }else if(n%2!=0){
                    System.out.println("IZQUIERDA");
                }
            }
        }while(n>0);
    }
}
