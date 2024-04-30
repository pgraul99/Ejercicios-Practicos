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
public class Ejercicio139 {

    public static void main(String[] args) {
        List<Integer> set;
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean b = false;

        do {
            set = new ArrayList<>();
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero == 1) {
                    b = true;
                    set.add(numero);
                } else {
                    String n = Integer.toString(numero);
                    set.add(numero);
                    while (Integer.parseInt(n) != 1) {
                        int resultado = 0;
                        for (int i = 0; i < n.length(); i++) {
                            resultado += Math.pow(Integer.parseInt(Character.toString(n.charAt(i))), 3);
                        }

                        n = Integer.toString(resultado);

                        if (set.contains(resultado)) {
                            b = false;
                            set.add(resultado);
                            break;
                        } else {
                            set.add(resultado);
                            b = true;
                        }
                    }
                }
                String s = "";
                for (Integer p : set) {
                    s += p + " - ";
                }
                System.out.print(s.trim());
                if (b) {
                    System.out.println("> cubifinito.");
                } else {
                    System.out.println("> no cubifinito.");
                }
            }
        } while (numero != 0);
    }

}
