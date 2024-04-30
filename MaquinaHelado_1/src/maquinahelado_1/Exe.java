/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinahelado_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe {

    public static void main(String[] args) throws Exception {
        MaquinaHelados mh = new MaquinaHelados();
        Scanner sc = new Scanner(System.in);
        menu(mh, sc);
    }

    public static void menu(MaquinaHelados mh, Scanner sc) {

        String opcion;
        do {
            System.out.println("1. Mostrar helados.");
            System.out.println("2. Introducir monedas. ");
            System.out.println("3. Pedir helado. ");
            System.out.println("4. Apagar máquina.");
            System.out.print("introduce tu número de opción o S para salir: ");
            opcion = sc.nextLine();
            System.out.println("");
            switch (opcion) {
                case "1":
                    mostrarHelados(mh);
                    break;
                case "2":
                    introducirMonedas(mh, sc);
                    break;
                case "3":
                    pedirHelado(mh, sc);
                    break;
                case "4":
                    apagar(mh);
                    break;
            }
            if (opcion.equals("4")) {
                break;
            }
        } while (!opcion.equals("s"));
    }

    public static void mostrarHelados(MaquinaHelados mh) {
        System.out.println("-----------Lista de helados-----------");
        HashMap<String, Helado> aux1 = mh.getHelados();
        ArrayList<Helado> aux = new ArrayList<>();
        for (Map.Entry<String, Helado> entry : aux1.entrySet()) {
            String key = entry.getKey();
            Helado val = entry.getValue();
            aux.add(val);
        }
        Collections.sort(aux);
        for (Helado helado : aux) {
            System.out.println(helado);
        }

        System.out.println("\n");
    }

    public static void introducirMonedas(MaquinaHelados mh, Scanner sc) {

        String opcion;

        double moneda = 0;
        System.out.println("Introduce que tipo de moneda quieres meter: ");
        System.out.println("1. 10 cts \n2. 20 cts\n3. 50 cts\n4. 1 euro\n5. 2 euros");
        do {
            System.out.print("Introduce la opción o s para salir: ");
            opcion = sc.nextLine();
            if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4") || opcion.equals("5")) {
                switch (opcion) {
                    case "1" ->
                        moneda = 0.1;
                    case "2" ->
                        moneda = 0.2;
                    case "3" ->
                        moneda = 0.5;
                    case "4" ->
                        moneda = 1;
                    case "5" ->
                        moneda = 2;
                }
            } else {
                moneda = 0;
            }
            mh.setMonedero(mh.getMonedero() + moneda);
            System.out.println("El contenido del monedero es: " + mh.getMonedero() + "€");
        } while (!opcion.equals("s"));
        System.out.println("");
    }

    public static void pedirHelado(MaquinaHelados mh, Scanner sc) {
        //si hay suficiente cantidad de helados y si en el monedero hay suficiente dinero
        //quitamos uno a la cantidad de helados que quedan en la máquina
        //mostrar has obtenido el helado: xxxx
        //quitarle al monedero el precio que haya costado ese helado
        //meter ingresi de lo que ha costado ese helado al total de la maquina.
        HashMap<String, Helado> aux = mh.getHelados();

        System.out.print("Introduce posición: ");
        String posicion = sc.nextLine();
        for (Map.Entry<String, Helado> entry : aux.entrySet()) {
            String key = entry.getKey();
            Helado val = entry.getValue();
            if (posicion.equals(key)) {
                if (mh.getMonedero() >= val.getPrecio() && val.getCantidad() > 0) {
                    val.setCantidad(val.getCantidad() - 1);
                    System.out.println("Has elegido el helado: " + val + "\n");
                    mh.setMonedero(1.0d * mh.getMonedero() - val.getPrecio());
                    mh.setIngreso(1.0d * mh.getIngreso() + val.getPrecio());
                } else if (val.getCantidad() < 1) {
                    System.out.println("Lo sentimos, no tenemos ese helado\n");

                } else if (mh.getMonedero() < val.getPrecio()) {
                    System.out.println("Introduce más crédito\n");
                }
            }

        }

    }

    public static void apagar(MaquinaHelados mh) {
        System.out.println("Las vueltas son: " + mh.getMonedero());
        System.out.println("Las ganancias han sido de: " + mh.getIngreso());
    }

}
