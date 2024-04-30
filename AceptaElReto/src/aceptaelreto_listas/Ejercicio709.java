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
public class Ejercicio709 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votos;
        Map<String, Integer> hm;
        do {
            hm = new HashMap<>();
            votos = Integer.parseInt(sc.next());
            String ganador = "";
            int valor, min = 0;
            if (votos != 0) {
                for (int i = 0; i < votos; i++) {
                    String participante = sc.next();
                    if (!hm.isEmpty()) {
                        if (hm.containsKey(participante)) {
                            valor = hm.get(participante);
                            hm.put(participante, valor + 1);
                        } else {
                            hm.put(participante, 1);
                        }
                    } else {
                        hm.put(participante, 1);
                    }
                }
                
                for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    int val = entry.getValue();
                    if(val > min){
                        ganador = key;
                        min = val;
                    }else if(min == val){
                        ganador = "EMPATE";
                    }
                }
                
                System.out.println(ganador);
            }

        } while (votos != 0);
    }
}
