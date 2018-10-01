package com.school.zad;

import com.school.zad.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", 5.0);
        student1.showInfo();

        Teacher teacher1 = new Teacher("Alicja", "Nowak", 3000);
        teacher1.showInfo();

    }

}
