/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Persona;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
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
    
    @Override
    @PermitAll
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Persona login(String userName,String password){
        List<Persona> personas;
        Persona p=null;
        Query q1=em.createQuery("SELECT p FROM Persona p LEFT JOIN FETCH p.rol WHERE p.nombre = :userName AND p.password = :passwd");
        q1.setParameter("userName", userName);
        q1.setParameter("passwd", password);
        personas=q1.getResultList();
        if(!personas.isEmpty()){
            System.out.println("Numero de entidades "+personas.size());
            System.out.println("Se recupero una entidad...");
            System.out.println("nombre "+personas.get(0).getNombre());
            return personas.get(0);
        }
        return p;
    }
}
