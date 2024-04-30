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
public class Ejercicio427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=0;
        String nombre, parentesco;
        n=Integer.parseInt(sc.nextLine());
        while(n>i){
            nombre=sc.nextLine();
            parentesco=sc.nextLine();
            if(nombre.equals("Luke") && parentesco.equals("padre")){
                System.out.println(nombre.replaceAll(nombre, "TOP SECRET")+parentesco.replaceAll(parentesco, ""));               
            }else{
                System.out.println(nombre+", yo soy tu "+parentesco);
            }
            i++;
        }
    }
}
