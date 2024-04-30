/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.DAO.implementations;

import com.mh.DAO.interfaces.HeladoDAO;
import com.mh.biz.Helado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class HeladoDAOimpl implements HeladoDAO, AutoCloseable {

    static {
        try {
            Class.forName(com.mh.utils.Configuration.DRIVER);
        } catch (Exception e) {
            System.exit(1);
        }
    }

    Connection con = null;

    public HeladoDAOimpl() throws Exception {
        con = DriverManager.getConnection(com.mh.utils.Configuration.URL);
    }

    @Override
    public Helado getHeladoByPosicion(String pos) throws Exception {
        Helado he = null;
        String sql = "select posicion, nombre, tipo, precio, cantidad from helado where posicion = ?";
        ResultSet rs = null;
        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, pos);
            rs = pstm.executeQuery();
            if (rs.next()) {
                he = new Helado(rs.getString("posicion"), rs.getString("nombre"), rs.getDouble("precio"), rs.getString("tipo"), rs.getInt("cantidad"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            rs.close();
        }
        return he;
    }

    @Override
    public int updateHeladById(Helado h) throws Exception {
        Helado he = null;
        int n = 0;
        String sql = "update helado set cantidad = ?, nombre = ? , tipo = ?, precio = ? WHERE posicion = ? ";
        try (PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, h.getCantidad());
            pstm.setString(2, h.getNombre());
            pstm.setString(3, h.getTipo());
            pstm.setDouble(4, h.getPrecio());
            pstm.setString(5, h.getPosicion());
            n = pstm.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        return n;
    }

    @Override
    public List<Helado> getHelado() throws Exception {
        List<Helado> he = new ArrayList<>();
        String sql = "select posicion, nombre, precio, tipo, cantidad from helado";
        try (PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery();) {
            while (rs.next()) {
                he.add(new Helado(rs.getString("posicion"),
                        rs.getString("nombre"),
                        Double.parseDouble(rs.getString("precio")),
                        rs.getString("tipo"),
                        rs.getInt("cantidad")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return he;
    }

    @Override
    public void close() throws Exception {
        con.close();
    }

}
