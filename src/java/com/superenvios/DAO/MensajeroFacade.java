/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Mensajero;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    
    @Override
    public List<Mensajero> findActivos(){
        Query q1=getEntityManager().createQuery("SELECT m FROM Mensajero m WHERE m.activo = :state");
        q1.setParameter("state", Boolean.TRUE);
        return q1.getResultList();
    }
    
}
