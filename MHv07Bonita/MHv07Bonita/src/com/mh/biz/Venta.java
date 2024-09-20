/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.biz;

import com.mh.DAO.implementations.HeladoDAOimpl;
import com.mh.DAO.implementations.VentaDAOimpl;
import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class Venta {

    private String fecha_hora;
    private String posicion;
    private String nombre;
    private double precio;
    private String tipo;
    private int cantidad;

    public Venta(String fecha_hora, String posicion, String nombre, double precio, String tipo, int cantidad) {
        this.fecha_hora = fecha_hora;
        this.posicion = posicion;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha_hora=" + fecha_hora + ", posicion=" + posicion + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", cantidad=" + cantidad + '}';
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
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

}
