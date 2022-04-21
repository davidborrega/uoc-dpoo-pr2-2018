/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetRescue {  
    private List<Home> homes;    
    private List<Volunteer> volunteers;    
    private List<Alert> alerts;
        
    public PetRescue() {
        homes = new ArrayList<Home>();
        volunteers = new ArrayList<Volunteer>();
        alerts = new ArrayList<Alert>();
    }    

    public List<Home> getHomes() {
        return homes;
    }

    public void setHomes(List<Home> homes) {
        this.homes = homes;
    }

    public List<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(List<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }  
    
    public Pet findPet(String id) {
        // PR2 EX2.2
        return null;        
    }

    public Pet newRescue(PetType type, String id, String name, Boolean pdd) {
        // PR2 EX2.1
        return null;        
    }

    public Shelter registerShelter(String name, String address, String email, Boolean garden, Boolean acceptPdd, int capacity, int maxDays, Boolean vet) {
        // PR1 EX4
        
        // Use auxiliary method to find an existing home with provided email.
        if(findHomeByEmail(email) != null) {
            return null;            
        }
        Shelter newShelter = new Shelter(capacity, maxDays, vet, name, address, email, garden, acceptPdd);
        this.homes.add(newShelter);
        
        return newShelter;
    }

    public Adoption registerAdoption(String name, String address, String email, Boolean garden, Boolean acceptPdd, int age) { 
        // PR1 EX4
        
        // Use auxiliary method to find an existing home with provided email.
        if(findHomeByEmail(email) != null) {
            return null;            
        }
        Adoption newAdoption = new Adoption(age, name, address, email, garden, acceptPdd);
        this.homes.add(newAdoption);
        
        return newAdoption;        
    }

    public Volunteer registerVolunteer(String name, String email, Boolean acceptPdd) { 
        // PR1 EX2
        
        // Use auxiliary method to find an existing volunteer with provided email.
        if(findVolunteerByEmail(email) != null) {
            return null;            
        }
        Volunteer newVolunteer = new Volunteer(name, email, acceptPdd);
        this.volunteers.add(newVolunteer);
        
        return newVolunteer;
    }

    public List<Volunteer> getRegisteredVolunteers() {
        // PR1 EX2
        return this.volunteers;
    }

    public List<Home> getRegisteredHomes() {
        // PR1 EX4
        return this.homes;
    }

    public List<Home> findHome(String id) {
        // PR2 EX3.1
        return null;        
    }

    public void assignHome(Pet pet, Home home) {
        // PR2 EX3.2                
        
        // PR2 EX4        
    }

    public List<Alert> getUnassignedAlerts() {
        // PR2 EX2.3
        return null;
    }

    public List<Alert> getPetAlerts(String id) {
        // PR2 EX2.3
        return null;
    }

    public List<Alert> getVolunteerAlerts(String email) {
        // PR2 EX3.1
        return null;        
    }

    public Home getCurrentHome(String id) {
        // PR2 EX3.2
        return null;        
    }

    public List<Volunteer> findVolunteer(String id) {
        // PR2 EX3.1
         return null;        
    }

    public void assignAlert(Alert alert, Volunteer volunteer) {
        // PR2 EX3.1
                
        // PR2 EX4        
    }

    public void closeAlert(Alert alert) {
        // PR2 EX2.3        
    }
    
    // PR1 EX2 Auxiliary method
    private Volunteer findVolunteerByEmail(String email) {
        Volunteer found = null;
        for(Volunteer v: this.volunteers) {
            if (email.equals(v.getEmail())) {
                found = v;
                break;
            }
        }
        return found;
    }
    
    // PR1 EX4 Auxiliary method
    private Home findHomeByEmail(String email) {
        Home found = null;
        for(Home h: this.homes) {
            if (email.equals(h.getEmail())) {
                found = h;
                break;
            }
        }
        return found;
    }
      
    public void addListener(EventListener listener) {
        // PR2 EX4.1        
    }    
}