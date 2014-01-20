/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Envio;
import com.superenvios.model.STATE;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.annotation.security.PermitAll;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author ITACHI
 */
@Stateless
public class EnvioFacade extends AbstractFacade<Envio> implements EnvioFacadeLocal, EnvioFacadeRemote {
    @PersistenceContext(unitName = "SuperEntregaDaosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnvioFacade() {
        super(Envio.class);
    }
    
    @Override
    @PermitAll
    public Long createEnvio(Envio envio){
        getEntityManager().persist(envio);
        //getEntityManager().refresh(e);
        getEntityManager().flush();
        //System.out.println("el id es "+envio.getId());
        return envio.getId();
    }

}
