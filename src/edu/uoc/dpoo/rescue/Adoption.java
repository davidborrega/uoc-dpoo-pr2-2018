/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

public class Adoption extends Home {
    private int age;

    public Adoption(int age, String name, String address, String email, Boolean garden, Boolean acceptPdd) {
        super(name, address, email, garden, acceptPdd);
        this.age = age;
    }   
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }   

    @Override
    public Boolean accept(Pet pet) {
        // NOT IMPLEMENTED
        return false;
    }
}