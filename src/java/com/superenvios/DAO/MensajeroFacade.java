/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Mensajero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ITACHI
 */
@Stateless
public class MensajeroFacade extends AbstractFacade<Mensajero> implements MensajeroFacadeLocal, com.superenvios.DAO.MensajeroFacadeRemote {
    @PersistenceContext(unitName = "SuperEntregaDaosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MensajeroFacade() {
        super(Mensajero.class);
    }
    
}
