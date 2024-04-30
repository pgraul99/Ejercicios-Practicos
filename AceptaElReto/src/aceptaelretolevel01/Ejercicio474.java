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
public class Ejercicio474 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, S, A, B, distancia = 0;

        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            S = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            int diferenciaA = Math.abs(S - A);
            int diferenciaB = Math.abs(S - B);
            if (diferenciaA <= diferenciaB) {
                distancia = diferenciaA;
                distancia += Math.abs(A-B);
                
            } else {
                distancia = diferenciaB;
                distancia += Math.abs(A-B);
            }
            System.out.println(distancia);
        }
    }
}
