/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

import java.util.Date;

public class Stay {

    private Date startedAt;
    private Date finisheddAt;    
    private Pet pet;
    private Home home;

    public Stay(Date startedAt, Pet pet, Home home) {
        this.startedAt = startedAt;
        this.pet = pet;
        this.home = home;
        this.finisheddAt = null;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getFinisheddAt() {
        return finisheddAt;
    }

    public void setFinisheddAt(Date finisheddAt) {
        this.finisheddAt = finisheddAt;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
        
    public Boolean isActive() {
        // PR2 EX3.2
        return false;        
    }
}