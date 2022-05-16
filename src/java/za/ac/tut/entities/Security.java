/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
 
/**
 *
 * @author hp
 */
@Entity
public class Security extends LaboratoryUser implements Serializable {
    private String workerType;

    public Security() {
    }

    public String getWorkerType() {
        return workerType;
    }

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    @Override
    public String toString() {
        return "Security{" + "workerType=" + workerType + '}';
    }
       
    
}
