/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mh.DAO.interfaces;

import com.mh.biz.Helado;
import java.util.List;

/**
 *
 * @author dev
 */
public interface HeladoDAO {

    public Helado getHeladoByPosicion(String pos) throws Exception;

    public int updateHeladById(Helado h) throws Exception;

    public List<Helado> getHelado() throws Exception;

}
