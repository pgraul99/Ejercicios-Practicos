/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinahelado_1;

/**
 *
 * @author pgrau
 */
public class Helado implements Comparable{
    private String nombre;
    private double precio;
    private String tipo;
    private int cantidad = 5;
    
    public Helado (String nombre, double precio, String tipo){
        this.nombre = nombre;
        this.precio = Utils.redondeo(precio);
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", precio= " + precio + ", tipo= " + tipo + ", cantidad= " + cantidad;
    }

    @Override
    public int compareTo(Object o) {
        Helado otro = (Helado) o;
        return this.getNombre().compareTo(otro.getNombre());
    }
    
    
}
