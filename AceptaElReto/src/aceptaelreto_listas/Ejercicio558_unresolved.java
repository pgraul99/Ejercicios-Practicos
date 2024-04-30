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
public class Ejercicio558_unresolved {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista;
        int n;
        while (sc.hasNext()) {
            lista = new ArrayList<>();
            n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                String s1 = sc.nextLine();
            }
            
            
           
            
            System.out.println("---");
        }

    }

//    public static List<String> filtrar(List<String> lista){
//        Map <String, String> hm = new HashMap<>();
//        
//    }

    public static int contarMayusculas(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contador++;
            }
        }
        return contador;
    }
}
