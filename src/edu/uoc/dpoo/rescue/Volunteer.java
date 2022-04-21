/*
* DPOO
* Semester 20181
* Pet Rescue
*/
package edu.uoc.dpoo.rescue;

public class Volunteer {
    private String email;
    private Boolean acceptPdd;
    private String name;

    public Volunteer(String name, String email, Boolean acceptPdd) {
        this.email = email;
        this.acceptPdd = acceptPdd;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAcceptPdd() {
        return acceptPdd;
    }

    public void setAcceptPdd(Boolean acceptPdd) {
        this.acceptPdd = acceptPdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
            
    public Boolean accept(Pet pet) {
        // NOT IMPLEMENTED
        return false;
    }
}