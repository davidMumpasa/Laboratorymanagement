/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Security;

/**
 *
 * @author hp
 */
@Local
public interface SecurityFacadeLocal {

    void create(Security security);

    void edit(Security security);

    void remove(Security security);

    Security find(Object id);

    List<Security> findAll();

    List<Security> findRange(int[] range);

    int count();
    
}
