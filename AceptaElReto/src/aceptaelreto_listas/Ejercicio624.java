/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto_listas;

import java.util.*;

/**
 *
 * @author pgrau
 */
public class Ejercicio624 {

    public static void main(String[] args) {
        HashSet<Integer> calcetines = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int casos;

        do {
            casos = sc.nextInt();
            int max = 0;
            if (casos != 0) {
                for (int i = 0; i < casos; i++) {
                    int numero = sc.nextInt();
                    if (!calcetines.contains(numero)) {
                        calcetines.add(numero);
                    }else {
                        calcetines.remove(numero);
                    }

                    if (max < calcetines.size()) {
                        max = calcetines.size();
                    }
                }

                System.out.println(max);
            }
        } while (casos != 0);
    }
}
