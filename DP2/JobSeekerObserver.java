package org.example.DP2;

import java.util.ArrayList;

public class JobSeekerObserver implements Observer{
    private ArrayList<Subscriber> subscribers;
    private int numSeekers;
    private static JobSeekerObserver jobSeekerObserver;
    public JobSeekerObserver(){
        this.subscribers = new ArrayList<>();
        this.numSeekers = 0;
        jobSeekerObserver = this;
    }
    public static JobSeekerObserver getJobSeekerObserver() {
        if (jobSeekerObserver == null) jobSeekerObserver = new JobSeekerObserver();
        return jobSeekerObserver;
    }

    public void addSubscriber(ArrayList<Subscriber> s){
        this.subscribers.addAll(s);
    }
    public void addSubscriber(Subscriber s){
        this.subscribers.add(s);
    }


    public void removeSubscriber(Subscriber s){
        this.subscribers.remove(s);
    }

    public void increaseNumSeekers(){
        this.numSeekers++;
    }


    @Override
    public void notifySubscribers(JobSeeker js) {
        for(Subscriber subscriber : subscribers){
            subscriber.newJobSeeker(js,numSeekers);
        }
    }
}
