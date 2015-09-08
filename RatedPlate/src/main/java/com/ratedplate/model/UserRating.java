package com.ratedplate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by SteveGreen on 03/09/15.
 *
 * This class will represent the basic user of the system.
 */

@Entity
public class UserRating implements Serializable{

    private static final long serialVersionUID = 135498375435098L;

    @Id
    @GeneratedValue
    Long id;
    private String name;
    private String someOtherAttribute;

    //JPA requires empty constructor
    public UserRating(){}

    public UserRating(String name, String other){
        this.name = name;
        this.someOtherAttribute = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
