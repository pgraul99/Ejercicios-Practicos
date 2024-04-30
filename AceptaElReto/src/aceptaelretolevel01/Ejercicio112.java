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
public class Ejercicio112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int metros, velocidad, segundos;

        while (true) {
            metros = sc.nextInt();
            velocidad = sc.nextInt();
            segundos = sc.nextInt();
            if (metros != 0 && velocidad != 0 && segundos != 0) {
                tratarCaso(metros, velocidad, segundos);
            } else if (metros != 0 || velocidad != 0 || segundos != 0) {
                tratarCaso(metros, velocidad, segundos);
            } else {
                break;
            }
        }

    }

    public static void tratarCaso(int metros, int velocidad, int segundos) {
        double media;
        media = (1.0d * metros / 1000) / (1.0d * segundos / 3600.0);

        if (metros > 0 && velocidad > 0 && segundos > 0) {
            if (media < velocidad) {
                System.out.println("OK");
            } else if (media > velocidad) {
                if ((media - velocidad) > (0.2d * velocidad)) {
                    System.out.println("PUNTOS");
                } else {
                    System.out.println("MULTA");
                }
            }
        } else {
            System.out.println("ERROR");
        }
    }

    

}
