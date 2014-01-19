/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Rol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ITACHI
 */
@Stateless
public class RolFacade extends AbstractFacade<Rol> implements RolFacadeLocal, com.superenvios.DAO.RolFacadeRemote {
    @PersistenceContext(unitName = "SuperEntregaDaosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolFacade() {
        super(Rol.class);
    }
    
}
