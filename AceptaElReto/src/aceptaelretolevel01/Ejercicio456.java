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
public class Ejercicio456 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, ancho, alto, necesarias, contador;

        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            necesarias = sc.nextInt();
            int total = ancho * alto;
            if (total >= necesarias) {
                contador = 1;
            } else {
                if (necesarias % total == 0) {
                    contador = necesarias / total;
                } else {
                    contador = (necesarias / total) + 1;
                }
            }
            System.out.println(contador);
        }

    }
}
