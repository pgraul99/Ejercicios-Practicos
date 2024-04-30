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
public class Ejercicio152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        Map<Integer, Integer> hm;
        do {
            hm = new HashMap<>();
            casos = sc.nextInt();
            int valor, moda = 0, min = 0;
            if (casos != 0) {
                for (int i = 0; i < casos; i++) {
                    int numero = sc.nextInt();
                    if (!hm.isEmpty()) {
                        if (hm.containsKey(numero)) {
                            valor = hm.get(numero);
                            hm.put(numero, valor + 1);
                        } else {
                            hm.put(numero, 1);
                        }
                    } else {
                        hm.put(numero, 1);
                    }
                }

                for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                    Integer key = entry.getKey();
                    Integer val = entry.getValue();
                    if (val > min) {
                        moda = key;
                        min = val;
                    }
                }
                
                System.out.println(moda);
            }

        } while (casos != 0);
    }
}
