/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.DAO.implementations;

import com.mh.DAO.interfaces.VentaDAO;
import com.mh.biz.Venta;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class VentaDAOimpl implements AutoCloseable, VentaDAO {
    
    static{
        try {
            Class.forName(com.mh.utils.Configuration.DRIVER);
        } catch (Exception e) {
            System.exit(1);
        }
    }

    Connection con = null;

    public VentaDAOimpl() throws SQLException {
        con = DriverManager.getConnection(com.mh.utils.Configuration.URL);
    }
    
    

    @Override
    public void close() throws Exception {
        con.close();
    }

    @Override
    public int insertVenta(Venta v) throws Exception {

        int r = 0;
        String sql = "INSERT INTO venta values (datetime('now'),?,?,?,?,?)";
        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, v.getPosicion());
            pstm.setString(2, v.getNombre());
            pstm.setDouble(3, v.getPrecio());
            pstm.setString(4, v.getTipo());
            pstm.setInt(5, v.getCantidad());
            r = pstm.executeUpdate();

        } catch (Exception e) {
            throw e;
        }
        return r;
    }

    @Override
    public List<Venta> getVenta() throws Exception{
        List lv = new ArrayList<>();
        String sql = "select fecha_hora, posicion, nombre, precio, tipo, cantidad from venta order by fecha_hora desc";
        ResultSet rs = null;

        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            rs = pstm.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getInt(6));
                lv.add(venta);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        return lv;
    }

}
