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
public class Ejercicio436 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int con = 0;
            int grosor = sc.nextInt();
            int altura = sc.nextInt();
            while(grosor < altura * (int) Math.pow(10, 6)){
                    grosor*=2;
                    con++;               
            }
            System.out.println(con);
        }
    }
}
