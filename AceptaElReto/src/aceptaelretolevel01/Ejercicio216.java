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
public class Ejercicio216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero, indice = 0, horas, minutos, segundos;
        n = sc.nextInt();
        do {
            numero = sc.nextInt();
            if (indice < n) {
                horas = numero / 3600;
                if (horas<24) {
                    int resto = numero % 3600;
                    minutos = resto / 60;
                    segundos = resto % 60;
                    
                    System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
                    System.out.println();
                }
                

            } else {
                break;
            }
            indice++;
        } while (indice<n);
    }
}
