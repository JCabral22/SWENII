package org.example.DP1;

import java.util.ArrayList;

class Lecturer {

    private String name;

    private ArrayList<Staff> staff;

    Lecturer(String name){
        this.name = name;
        this.staff = new ArrayList();
    }

    public void addStaff(Staff staff){
        this.staff.add(staff);
    }
    public void removeStaff(Staff staff){
        this.staff.remove(staff);
    }
    public void doWork(){
        System.out.println("Lecturer "+this.name+" : is lecturing.");

        this.staff.forEach(Staff::doWork);
    }


}