/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.LaboratoryUser;

/**
 *
 * @author hp
 */
@Local
public interface UserFacadeLocal {

    void AddUser(LaboratoryUser user);

    void edit(LaboratoryUser user);

    void remove(LaboratoryUser user);

    LaboratoryUser findUser(Object id);

    List<LaboratoryUser> findAll();

    List<LaboratoryUser> findRange(int[] range);

    int count();
    
}
