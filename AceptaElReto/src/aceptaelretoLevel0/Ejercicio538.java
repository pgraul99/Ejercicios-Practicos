/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretoLevel0;

import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio538 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String edadNacimiento, edadIglesia;
        

        do {
            edadNacimiento = sc.next();
            edadIglesia = sc.next();
            int r = Integer.parseInt(edadNacimiento);
            int s = Integer.parseInt(edadIglesia);
            if ((1 <= r && r <= 1000) && (1 <= s && s <= 1000)) {
                if (r < s) {
                    System.out.println("SENIL");
                } else {
                    System.out.println("CUERDO");
                }
            }
            else if(r == 0 && s ==0){
                break;
            }

        } while (true);

    }
}
