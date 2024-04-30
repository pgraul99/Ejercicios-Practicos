/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretoLevel0;


import java.util.Scanner;

public class Ejercicio362 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nav="25 12";       
        int n = Integer.parseInt(sc.nextLine());
        int i = 0;

        while (i < n) {
            String fechaMetida= sc.nextLine();
            if(fechaMetida.equals(nav)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

            i++;
        }
    }
}
