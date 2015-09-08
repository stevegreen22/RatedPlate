package com.ratedplate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Entity
public class Plate {

    @Version
    private Long version;

    @Id
    @GeneratedValue
    private Long plateId;
    private String description;
    private BigDecimal price;

    public Plate(){}

    public Plate(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPlateId() {
        return plateId;
    }

}
