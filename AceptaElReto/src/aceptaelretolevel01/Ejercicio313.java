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
public class Ejercicio313 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, ingresos, gastos;
        casos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casos; i++) {
            ingresos = Integer.parseInt(sc.next());
            gastos = Integer.parseInt(sc.next());
            if ((ingresos > -10000 && ingresos < 10000) && (gastos > -10000 && gastos < 10000)) {
                if (gastos < 0) {
                    int saldo = ingresos - gastos;
                    if (saldo >= 0) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    int saldo = ingresos + gastos;
                    if (saldo >= 0) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                }

            }
        }
    }
}
