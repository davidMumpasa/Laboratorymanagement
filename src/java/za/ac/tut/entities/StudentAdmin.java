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
public class StudentAdmin extends LaboratoryUser implements Serializable {
 private String subjectCode;

    public StudentAdmin() {
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "StudentAdmin{" + "subjectCode=" + subjectCode + '}';
    }
 
   
}
