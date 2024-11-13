package org.example.DP1;

class Tutor implements Staff {

    private String name;

    Tutor(String name){
        this.name = name;
    }

    public void doWork(){
        System.out.println("Tutor "+name+" : is tutoring.");
    }
}