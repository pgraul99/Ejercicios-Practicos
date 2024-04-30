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
public class Ejercicio480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, uvasCompradas, uvasSanas, uvasMalas, res = 0;

        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            uvasCompradas = sc.nextInt();
            uvasMalas = sc.nextInt();
            uvasSanas = sc.nextInt();
            int aux = (uvasCompradas / uvasSanas) * uvasMalas;
            if (uvasCompradas % uvasSanas == 0) {
                res = aux;
            } else {
                int auxiliar = uvasSanas;
                while (auxiliar < uvasCompradas) {
                    res += uvasMalas;
                    auxiliar *= 2;
                }
            }

            System.out.println(res);
        }
    }
}
