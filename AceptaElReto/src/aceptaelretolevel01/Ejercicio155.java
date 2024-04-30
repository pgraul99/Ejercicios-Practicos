/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretolevel01;

import static aceptaelretolevel01.Ejercicio140.suma;
import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio155 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numero2;
        while (true) {
            numero = sc.nextInt();
            numero2 = sc.nextInt();
            if (numero >= 0 && numero2 >= 0) {
                System.out.println(perimetro(numero, numero2));
            } else {
                break;
            }
        }
    }

    public static int perimetro(int n, int p) {
        return (n + p) * 2;
    }
}
