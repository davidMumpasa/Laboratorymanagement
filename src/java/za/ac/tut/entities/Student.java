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
public class Student extends LaboratoryUser implements Serializable {

    private String campus;

    public Student() {
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Student{" + "campus=" + campus + '}';
    }
    
      
}
