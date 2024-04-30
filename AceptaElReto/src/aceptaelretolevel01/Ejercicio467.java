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
public class Ejercicio467 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;

        casos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < casos; i++) {
            String[] array;
            String str = sc.nextLine();
            array = str.split(" ");

            if (array[0].toLowerCase().equals(array[2].toLowerCase())) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }

        }
    }
}
