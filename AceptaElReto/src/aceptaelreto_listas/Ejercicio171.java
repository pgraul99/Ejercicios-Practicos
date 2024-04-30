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
public class Ejercicio171 {

    public static void main(String[] args) {
        int casos;
        Scanner sc = new Scanner(System.in);
        List<Integer> list;
        do {
            list = new ArrayList<>();
            casos = sc.nextInt();
            int max, cont;

            if (casos != 0) {
                max = 0;
                cont = 0;
                for (int i = 0; i < casos; i++) {
                    int montana = sc.nextInt();
                    list.add(montana);
                }
                
                for (int i = list.size() -1; i >= 0; i--) {
                    if(list.get(i) > max){
                        max = list.get(i);
                        cont++;
                    }
                }
                
                System.out.println(cont);
            }
            
        } while (casos != 0);
    }

}
