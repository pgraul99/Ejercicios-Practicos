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
public class Ejercicio293 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, insectos, aracnidos, crustaceos, escalopendras, anillosEscalopendras;
        casos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casos; i++) {
            insectos = Integer.parseInt(sc.next()) * 6;
            aracnidos = Integer.parseInt(sc.next()) * 8;
            crustaceos = Integer.parseInt(sc.next()) * 10;
            escalopendras = Integer.parseInt(sc.next());
            anillosEscalopendras = Integer.parseInt(sc.next());
            int totalEscalopendras = escalopendras * anillosEscalopendras * 2;
            int total = insectos + aracnidos + crustaceos + totalEscalopendras;
            if(total<=1000000000){
                System.out.println(total);
            }
        }
    }

}
