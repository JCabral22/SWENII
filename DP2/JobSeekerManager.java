package org.example.DP2;

import java.util.ArrayList;

class JobSeekerManager {
    JobSeekerObserver jso =  JobSeekerObserver.getJobSeekerObserver();
    public void newJobSeeker(String firstname, String lastname, int age){
        JobSeeker js = new JobSeeker(firstname, lastname, age);
        jso.increaseNumSeekers();
        jso.notifySubscribers(js);
    }
}