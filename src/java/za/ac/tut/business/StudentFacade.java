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
import za.ac.tut.entities.Student;

/**
 *
 * @author hp
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "LaboratoryManagementPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public List<Student> findAllStudents() {
       
        return findAll();
        
    }

    @Override
    public void editStudent(Student student) {
        edit(student);
    }

    @Override
    public void removeStudent(Student student) {
         remove(student);
    }

    @Override
    public Student findStudent(Object id) {
        return find(id);
    }
    
}
