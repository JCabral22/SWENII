package org.example.DP2;

class Main {


    public static void main(String[] args) {

        JobSeekerManager jsm = new JobSeekerManager();

        Employer e = new Employer("Ben");
        Admin a = new Admin("Pam");
        JobSeekerObserver jso = JobSeekerObserver.getJobSeekerObserver();

        jso.addSubscriber(a);
        jsm.newJobSeeker("Bob", "Smith", 25);
        jso.addSubscriber(e);
        jsm.newJobSeeker("sally", "Smith", 27);
    }
}