package org.example.DP2;

class Employer implements Subscriber {
    private String name;
    private int numSeekers;

    Employer(String name){
        this.name = name;
        this.numSeekers = 0;
    }

    @Override
    public void newJobSeeker(JobSeeker js, int numSeekers){
        System.out.println("Employer " + this.name+" : I am notified of job seeker: "+js.getFirstname());
        System.out.println("There are currently "+numSeekers+" job seekers that I know  of");
    }



}