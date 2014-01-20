/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superenvios.DAO;

import com.superenvios.model.Envio;
import com.superenvios.model.STATE;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITACHI
 */
public class EnvioFacadeTest {
    
    private static EJBContainer container;
    
    public EnvioFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
    }
    
    @AfterClass
    public static void tearDownClass() {
       container.close();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class EnvioFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Envio entity = new Envio();
        entity.setDestino("Calle falasa 123");
        entity.setOrigen("Calle 2345");
        entity.setEstado(STATE.RECIBIDO);
        entity.setNombreDestinatario("yesika");
        entity.setObservaciones("fragil");
        
        System.out.println("Haciendo lookup....");
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/SuperEntregasDaos/EnvioFacade");
        instance.create(entity);

        // TODO review the generated test code and remove the default call to fail.
        Envio e=instance.find(1L);
        assertEquals(e.getId(),e.getId());
    }

    /**
     * Test of edit method, of class EnvioFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Envio entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/classes/EnvioFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class EnvioFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Envio entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/classes/EnvioFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EnvioFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/classes/EnvioFacade");
        Envio expResult = null;
        Envio result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class EnvioFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/classes/EnvioFacade");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class EnvioFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/classes/EnvioFacade");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class EnvioFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EnvioFacadeLocal instance = (EnvioFacadeLocal)container.getContext().lookup("java:global/classes/EnvioFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}