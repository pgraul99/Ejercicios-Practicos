/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinahelado_1;

import java.util.HashMap;

/**
 *
 * @author pgrau
 */
public class MaquinaHelados extends Exception {

    private double monedero;
    private double ingreso;
    private HashMap<String,Helado> helados = new HashMap <>();
    

    public MaquinaHelados() throws Exception {             
        this.helados.put("00",new Helado("Chocobomba", 1.5, "tarrina"));
        this.helados.put("01", new Helado("FresaGuapi", 1.1, "palo"));
        this.helados.put("02", new Helado("LimónCanela", 1.9, "cucurucho"));
        this.helados.put("10", new Helado("FrigLemon", 1.2, "tarrina"));
        this.helados.put("11", new Helado("PiñaHelada", 1.8, "palo"));
        this.helados.put("12", new Helado("MoraGuay", 1.3, "cucurucho"));
        this.helados.put("20", new Helado("ChocoLoco", 1.6, "tarrina"));
        this.helados.put("21", new Helado("TuttiFrutti", 1.4, "palo"));
        this.helados.put("22", new Helado("Mentazul", 2.2,"cucurucho"));
    }
    
    

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    
    public HashMap<String, Helado> getHelados() {
        return helados;
    }

    public void setHelados(HashMap<String,Helado>helados) {
        this.helados = helados;
   }
    
    

}
