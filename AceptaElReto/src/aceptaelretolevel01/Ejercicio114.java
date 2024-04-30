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
public class Ejercicio114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero, indice = 0;
        n = sc.nextInt();
        do {
            if (indice < n) {
                if (n > 0) {
                    numero = sc.nextInt();
                    String factorial = Integer.toString(factorial(numero));
                    char c = factorial.charAt(factorial.length() - 1);
                    int s=Character.getNumericValue(c);
                    System.out.println(s);
                }
            } else {
                break;
            }
            indice++;
        } while (n > 0);
    }

    public static int factorial(int n) {
        int resultado=1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
