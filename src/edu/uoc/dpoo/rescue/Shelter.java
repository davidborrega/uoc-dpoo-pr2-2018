/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

public class Shelter extends Home {
    private int capacity;
    private int maxDays;
    private Boolean vet;

    public Shelter(int capacity, int maxDays, Boolean vet, String name, String address, String email, Boolean garden, Boolean acceptPdd) {
        super(name, address, email, garden, acceptPdd);
        this.capacity = capacity;
        this.maxDays = maxDays;
        this.vet = vet;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxDays() {
        return maxDays;
    }

    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }

    public Boolean getVet() {
        return vet;
    }

    public void setVet(Boolean vet) {
        this.vet = vet;
    }
        
    @Override
    public Boolean accept(Pet pet) {
        // PR2 EX3.2
        return false;
    }
}