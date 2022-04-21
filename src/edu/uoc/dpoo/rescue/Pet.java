/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pet {
    private Boolean pdd;
    private String id;
    private String name;
    private Date rescueAt;
    private int age;    
    private PetType type;  
    private List<Stay> homes;

    public Pet(String id, String name, PetType type, Date rescueAt, Boolean pdd) {
        this.pdd = pdd;
        this.id = id;
        this.name = name;
        this.age = 0;
        this.type = type;
        this.rescueAt = rescueAt;
        this.homes = new ArrayList<Stay>();
    }

    public Boolean getPdd() {
        return pdd;
    }

    public void setPdd(Boolean pdd) {
        this.pdd = pdd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRescueAt() {
        return rescueAt;
    }

    public void setRescueAt(Date rescueAt) {
        this.rescueAt = rescueAt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public List<Stay> getHomes() {
        return homes;
    }

    public void setHomes(List<Stay> homes) {
        this.homes = homes;
    }   
    
    public Home getCurrentHome() {
        // PR2 EX3.2
        return null;        
    }
}