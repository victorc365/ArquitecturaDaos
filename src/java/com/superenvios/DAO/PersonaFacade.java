/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ITACHI
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal, com.superenvios.DAO.PersonaFacadeRemote {
    @PersistenceContext(unitName = "SuperEntregaDaosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    public Persona login(String userName,String password){
        Persona p=null;
        Query q1=em.createQuery("SELECT p FROM Persona p JOIN FETCH p.rol");
        p=(Persona)q1.getSingleResult();
        return p;
    }
}
