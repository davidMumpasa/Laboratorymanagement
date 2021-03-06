/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Security;

/**
 *
 * @author hp
 */
@Stateless
public class SecurityFacade extends AbstractFacade<Security> implements SecurityFacadeLocal {

    @PersistenceContext(unitName = "LaboratoryManagementPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SecurityFacade() {
        super(Security.class);
    }

    @Override
    public void editSecurity(Security security) {
        edit(security);
    }

    @Override
    public void removeSecurity(Security security) {
        remove(security);
    }

    @Override
    public Security findSecurity(Object id) {
       return find(id);
    }

    @Override
    public List<Security> findAllSecurities() {
        return findAll();
    }
    
}
