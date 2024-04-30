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
public class Ejercicio407 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casilla, posicion, dado;

        do {
            casilla = sc.nextInt();
            posicion = sc.nextInt();
            dado = sc.nextInt();
            if (casilla != 0 && posicion != 0 && dado != 0) {
                int nuevaPos = posicion + dado;
                if (nuevaPos <= casilla) {
                    System.out.println(nuevaPos);
                }else{
                    int aux = nuevaPos - casilla;
                    int posDefinitiva = casilla - aux;
                    System.out.println(posDefinitiva);
                }
            }

        } while (casilla != 0 && posicion != 0 && dado != 0);
    }
}
