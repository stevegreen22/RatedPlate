package com.ratedplate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by SteveGreen on 03/09/15.

 Class will, at it's most basic level, represent pubs etc.
 A plate will be linked to the establishment in the db.
 */

@Entity
public class Establishment implements Serializable{

    @Version
    private Long version;

    @Id
    @GeneratedValue
    Long esatbId;
    private String name;
    private String location;
    private int lat;
    private int lon; //jsut an idea...

    @OneToMany()//mapped by?
    private List<Plate> plates;

    public Establishment(){}

    public Establishment(String name, String location, int lat, int lon) {
        this.name = name;
        this.location = location;
        this.lat = lat;
        this.lon = lon;
    }

    public Long getVersion() {
        return version;
    }


    public Long getEstabId() {
        return esatbId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plate> getPlates() {
        return plates;
    }

    public void setPlates(List<Plate> plates) {
        this.plates = plates;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Establishment{" +
                "version=" + version +
                "esatbId=" + esatbId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
