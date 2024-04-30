/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretolevel01;

import java.util.Scanner;

public class Ejercicio380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, gastos, suma = 0;
        do {
            casos = sc.nextInt();
            if (casos != 0 && casos <= 50000) {
                for (int i = 0; i < casos; i++) {
                    gastos = sc.nextInt();
                    suma += gastos;
                }
                System.out.println(suma);                
            }
            suma=0;
        } while (casos != 0 && casos < 50000);
    }
}
