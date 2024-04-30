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
public class Ejercicio512 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, conejo, caballo;
        casos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casos; i++) {
            conejo = sc.nextInt();
            caballo = sc.nextInt();
            int total = conejo + caballo;
            System.out.println(100 * conejo / total);
        }
    }
}
