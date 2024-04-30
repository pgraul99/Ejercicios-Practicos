/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinahelado_1;

/**
 *
 * @author pgrau
 */
public class Utils {

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    public static double hipotenusa(double c1, double c2) {
        return Math.sqrt(Math.pow(c2, 2) + Math.pow(c1, 2));
    }

    public static double redondeo(double d) {
        double r = d * 100;
        r = Math.round(r);
        r = r / 100;
        //return (Math.round(d * 100)) / 100;
        return r;
    }
}
