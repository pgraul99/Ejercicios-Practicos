/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretolevel02;

import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio102_unresolved {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        String alfabeto="abcdefghijklmnopqrstuvwyz";
        String str1;
        String str2 = "";

        do {
            str1 = sc.nextLine();
            c = str1.charAt(0);
            if (!str1.equals("FIN")) {
                if (c == 'p') {
                    System.out.println(conteo(str1));
                } else {
                    
                }
            }

        } while (!str1.equals("FIN"));
    }

    public static int conteo(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i)) == 'a' || Character.toLowerCase(texto.charAt(i)) == 'e' || Character.toLowerCase(texto.charAt(i)) == 'i' || Character.toLowerCase(texto.charAt(i)) == 'o' || Character.toLowerCase(texto.charAt(i)) == 'u') {
                contador++;
            }
        }
        return contador;
    }

}
