package com.school.zad;

public class Student extends Person {

    private double GPA;

    Student(String firstName, String lastName, double GPA) {
        super(firstName, lastName);
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(getGPA());
    }
}
