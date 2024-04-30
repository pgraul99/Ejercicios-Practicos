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
public class Ejercicio515 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {

            n = sc.nextInt();
            if (n != 0) {
                if (n == 1 || n % 2 == 0) {
                    System.out.println(n);
                } else if (n % 2 == 1) {
                    System.out.println(n - 1);
                }
            }
        } while (n != 0);

    }
}
