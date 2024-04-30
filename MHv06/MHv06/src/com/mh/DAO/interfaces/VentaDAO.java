/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mh.DAO.interfaces;

import com.mh.biz.Venta;
import java.util.List;

/**
 *
 * @author dev
 */
public interface VentaDAO {
     
    public int insertVenta(Venta v) throws Exception;
    public List<Venta> getVenta() throws Exception;
    
}
