package org.example.DP1;

class Main {
    public static void main(String[] args) {
        Lecturer ron = new Lecturer("Ron");
        Marker roy = new Marker("Roy");
        Tutor sally = new Tutor("Sally");
        Lecturer ken = new Lecturer("Ken");

        ron.addStaff(roy);
        ron.addStaff(sally);
        ron.doWork();

    }
}