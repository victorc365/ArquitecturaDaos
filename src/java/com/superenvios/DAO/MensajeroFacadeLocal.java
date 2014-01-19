/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Mensajero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ITACHI
 */
@Local
public interface MensajeroFacadeLocal {

    void create(Mensajero mensajero);

    void edit(Mensajero mensajero);

    void remove(Mensajero mensajero);

    Mensajero find(Object id);

    List<Mensajero> findAll();

    List<Mensajero> findRange(int[] range);

    int count();
    
}
