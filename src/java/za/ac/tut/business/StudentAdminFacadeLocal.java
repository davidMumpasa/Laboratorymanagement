/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.StudentAdmin;

/**
 *
 * @author hp
 */
@Local
public interface StudentAdminFacadeLocal {

    void create(StudentAdmin studentAdmin);

    void edit(StudentAdmin studentAdmin);

    void removeStudentAdmin(StudentAdmin studentAdmin);

    StudentAdmin findStudentAdmin(Object id);

    List<StudentAdmin> findAllStudentAdmin();

    List<StudentAdmin> findRange(int[] range);

    int count();
    
}
