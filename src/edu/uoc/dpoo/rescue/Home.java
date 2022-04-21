/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

import java.util.ArrayList;
import java.util.List;

public abstract class Home {
    private String name;
    private String address;
    private String email;
    private Boolean garden;
    private Boolean acceptPdd;
    private List<PetType> allowed;
    private List<Stay> pets;

    public Home(String name, String address, String email, Boolean garden, Boolean acceptPdd) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.garden = garden;
        this.acceptPdd = acceptPdd;
        this.allowed = new ArrayList<PetType>();
        this.pets = new ArrayList<Stay>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGarden() {
        return garden;
    }

    public void setGarden(Boolean garden) {
        this.garden = garden;
    }

    public Boolean getAcceptPdd() {
        return acceptPdd;
    }

    public void setAcceptPdd(Boolean acceptPdd) {
        this.acceptPdd = acceptPdd;
    }

    public List<PetType> getAllowed() {
        return allowed;
    }

    public void setAllowed(List<PetType> allowed) {
        this.allowed = allowed;
    }

    public List<Stay> getPets() {
        return pets;
    }

    public void setPets(List<Stay> pets) {
        this.pets = pets;
    }
           
    public abstract Boolean accept(Pet pet);

    public void addType(PetType type) {
        // PR1 EX4
        if (!acceptPetType(type)) {
            allowed.add(type);
        }
    }

    public void removeType(PetType type) {
        // PR1 EX4
        allowed.remove(type);
    }
    
    public List<Pet> getCurrentPets() {
        // PR2 EX3.2
        return null;        
    }
    
    // PR1 EX4 Auxiliary method
    protected boolean acceptPetType(PetType type) {
        boolean found = false;
        for(PetType t: this.allowed) {
            if (type == t) {
                found = true;
                break;
            }
        }
        return found;
    }
}