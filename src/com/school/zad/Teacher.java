package com.school.zad;

public class Teacher extends Person {

    private double salary;

    Teacher(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(getSalary());
    }
}
