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
public class Ejercicio506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        String [] a= new String [2];
        String str="";
        casos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casos; i++){
            str = sc.nextLine();
            a= str.split(" / ");
            int n = Integer.parseInt(a[0]);
            int p = Integer.parseInt(a[1]);
            if(n >= p){
                System.out.println("BIEN");
            }else{
                System.out.println("MAL");
            }
        }
    }
}
