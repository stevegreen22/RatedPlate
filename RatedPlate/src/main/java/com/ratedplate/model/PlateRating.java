package com.ratedplate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Entity
public class PlateRating {

    @Id
    @GeneratedValue
    Long id;
    private Long platedId;

    public Long getPlatedId() {
        return platedId;
    }

    public void setPlatedId(Long platedId) {
        this.platedId = platedId;
    }

    private String rating;

    public PlateRating(){}

    public PlateRating(String rating){
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
