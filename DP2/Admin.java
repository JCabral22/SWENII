package org.example.DP2;

class Admin implements Subscriber {
    private String name;
    Admin(String name){
        this.name = name;
    }


    @Override
    public void newJobSeeker(JobSeeker js, int numSeekers) {
        System.out.println("Admin "+ this.name+" : I am notified of job seeker: "+js.getFirstname());
        System.out.println("There are currently "+numSeekers+" job seekers that I know  of");
    }
}