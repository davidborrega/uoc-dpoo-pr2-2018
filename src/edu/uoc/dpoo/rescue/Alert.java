/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

import java.util.Date;

public class Alert {

    private Date createdAt;
    private Date assignedAt;
    private Date closedAt;
    private Volunteer assigned;
    private Pet pet;
    private AlertType type;

    public Alert(Pet pet, AlertType type) {
        this.pet = pet;
        this.type = type;
        this.createdAt = new Date();
        this.assigned = null;        
        this.assignedAt = null;
        this.closedAt = null;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Date assignedAt) {
        this.assignedAt = assignedAt;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public Volunteer getAssigned() {
        return assigned;
    }

    public void setAssigned(Volunteer assigned) {
        this.assigned = assigned;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public AlertType getType() {
        return type;
    }

    public void setType(AlertType type) {
        this.type = type;
    }
      
    public void assign(Volunteer volunteer) {
        // PR2 EX3.1        
    }
}