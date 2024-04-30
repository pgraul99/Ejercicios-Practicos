/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelretoLevel0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio245 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int altura, aux, cont = 0;
        boolean b;
        ArrayList<Integer> alturas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                alturas.add(sc.nextInt());
                if (i == 0) {
                    continue;   
                } else if (alturas.get(i) == alturas.get(i - 1) + 1) {
                    b = true;
                } else {
                    b = false;
                    cont++;
                }
            }
            if (cont > 0) {
                System.out.println("DESCONOCIDO");
            } else {
                System.out.println("DALTON");
            }
        } while (n > 1);
    }

}
