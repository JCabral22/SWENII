package org.example.DP2;

class JobSeeker{
    private String firstname;
    private String lastname;
    private int age;

    JobSeeker(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname(){
        return this.firstname;
    }
}