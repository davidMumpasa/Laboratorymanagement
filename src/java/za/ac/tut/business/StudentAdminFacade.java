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
import za.ac.tut.entities.StudentAdmin;

/**
 *
 * @author hp
 */
@Stateless
public class StudentAdminFacade extends AbstractFacade<StudentAdmin> implements StudentAdminFacadeLocal {

    @PersistenceContext(unitName = "LaboratoryManagementPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentAdminFacade() {
        super(StudentAdmin.class);
    }

    @Override
    public List<StudentAdmin> findAllStudentAdmin() {
         return findAll();
    }

    @Override
    public StudentAdmin findStudentAdmin(Object id) {
         return find(id);
    }

    @Override
    public void removeStudentAdmin(StudentAdmin studentAdmin) {
         remove(studentAdmin);
    }
    
}
