/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author hp
 */
@Entity
public class Admin extends LaboratoryUser implements Serializable {

    private String verification;

    public Admin() {
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    @Override
    public String toString() {
        return "Admin{" + "verification=" + verification + '}';
    }

}
