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
public class Ejercicio190 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, den;
        while (true) {
            num = sc.nextLong();
            den = sc.nextLong();
            long fact=1;
            if (num > den) {
                for (long i = den + 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println(fact);

            } else {
                break;
            }

        }
    }

}
