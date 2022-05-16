/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.LaboratoryUser;

/**
 *
 * @author hp
 */
@Stateless
public class UserFacade extends AbstractFacade<LaboratoryUser> implements UserFacadeLocal {

    @PersistenceContext(unitName = "LaboratoryManagementPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(LaboratoryUser.class);
    }

    @Override
    public void AddUser(LaboratoryUser user) {
        create(user); 
    }

    @Override
    public LaboratoryUser findUser(Object id) {
                 
         return find(id);
    }
    
}
