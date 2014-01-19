/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Envio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ITACHI
 */
@Local
public interface EnvioFacadeLocal {

    void create(Envio envio);

    void edit(Envio envio);

    void remove(Envio envio);

    Envio find(Object id);

    List<Envio> findAll();

    List<Envio> findRange(int[] range);

    int count();
    
}
