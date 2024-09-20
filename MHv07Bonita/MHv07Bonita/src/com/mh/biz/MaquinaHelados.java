/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.biz;

import com.mh.DAO.implementations.HeladoDAOimpl;
import com.mh.DAO.implementations.VentaDAOimpl;
import com.mh.exceptions.*;
import com.mh.utils.Utils;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author enriquenogal
 */
public class MaquinaHelados {

    private double monedero = 0;
    private double ingresos = 0;

    public Helado pedirHelado(String pos) throws Exception {

        Helado h = null;
        Venta v = null;

        try (HeladoDAOimpl heladoImpl = new HeladoDAOimpl(); VentaDAOimpl ventaDaoImpl = new VentaDAOimpl();) {
            h = heladoImpl.getHeladoByPosicion(pos);
            if (h == null) {
                throw new NotValidPositionException("Posición errónea");
            } else if (h.getCantidad() <= 0) {
                throw new QuantityExceededException("No quedan esos helados");
            } else if (this.monedero < h.getPrecio()) {
                throw new NotEnoughMoneyException("No hay suficiente dinero");
            } else {
                this.ingresos = this.ingresos + h.getPrecio();
                this.monedero = this.monedero - h.getPrecio();
                this.ingresos = Utils.redondeoDosDecimales(this.ingresos);
                this.monedero = Utils.redondeoDosDecimales(this.monedero);
                h.setCantidad(h.getCantidad() - 1);
                heladoImpl.updateHeladById(h);
                v = new Venta(null, pos, h.getNombre(), h.getPrecio(), h.getTipo(), 1);
                ventaDaoImpl.insertVenta(v);
            }
        } catch (Exception e) {
            throw e;
        }
        return h;
    }

    
    public ArrayList<Helado> toList() {
        ArrayList<Helado> al = new ArrayList<>();
        try (HeladoDAOimpl heladoImpl = new HeladoDAOimpl();) {
            al = (ArrayList) heladoImpl.getHelado();
        } catch (Exception ex) {
        }
        return al;
    }
    
    public ArrayList<Venta> toListVenta() {
        ArrayList<Venta> al = new ArrayList<>();
        try (VentaDAOimpl v = new VentaDAOimpl();) {
            al = (ArrayList) v.getVenta();
        } catch (Exception ex) {
        }
        return al;
    }

    public double getMonedero() {
        return monedero;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setMonedero(double monedero) {
        this.monedero = Utils.redondeoDosDecimales(monedero);
    }

    public void setIngresos(double ingresos) {
        this.ingresos = Utils.redondeoDosDecimales(ingresos);
    }

}
