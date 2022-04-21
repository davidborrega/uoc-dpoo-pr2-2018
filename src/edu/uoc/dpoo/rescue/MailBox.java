/*
* DPOO
* Semester 20181
* Pet Rescue
*/

package edu.uoc.dpoo.rescue;

import java.util.ArrayList;
import java.util.List;

public class MailBox implements EventListener {
    private List<Mail> mails;

    public MailBox() {
        mails = new ArrayList<Mail>();
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void setMails(List<Mail> mails) {
        this.mails = mails;
    }
    
    public void sendMail(String email, String subject, String body) {
        // PR1 EX3
        this.mails.add(new Mail(email, subject, body));
    }

    public List<Mail> getSentMails(String email) {
        // PR1 EX3
        List<Mail> retList = new ArrayList<Mail>();
        
        for (Mail m: this.mails) {
            if (email.equals(m.getEmail())) {
                retList.add(m);
            }
        }
        return retList;
    }

    @Override
    public void onNewHome(Pet pet, Home home) {
        // PR2 EX4.2        
    }

    @Override
    public void onNewRescue(Pet pet, Volunteer volunteer) {
        // NOT IMPLEMENTED
    }

    @Override
    public void onNewAlert(Alert alert) {
        // PR2 EX4.2                
    }
}
