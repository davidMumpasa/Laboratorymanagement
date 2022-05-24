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

    void editSecurity(Security security);

    void removeSecurity(Security security);

    Security findSecurity(Object id);

    List<Security> findAllSecurities();

    List<Security> findRange(int[] range);

    int count();
    
}
