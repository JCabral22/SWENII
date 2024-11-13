package org.example.DP1;

class Marker implements Staff{

    private String name;

    Marker(String name){
        this.name = name;
    }

    public void doWork(){
        System.out.println("Marker "+name+" : is marking.");
    }
}