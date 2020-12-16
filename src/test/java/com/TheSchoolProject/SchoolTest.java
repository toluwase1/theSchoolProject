package com.TheSchoolProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SchoolTest {

    @Test
    void addApplicant() {
        School school = new School("Decagon");
        assertEquals(true, school.addStudent(new Students("tolu",234, "student", "Sangotedo", "male", "jss1")));
//        Students students = new Students("Damilola omowumi", );/
        //sc
        //st

    }

    @Test
    void testAddApplicant() {
        Person favour = new Person("damilola omowumi", 8, "student",  "asajon", "male", 9);
        Principal chika = new Principal("Chika", 2340, "Principal", "USA", "Male", "floor 1");

    }

    @Test
    void getApplicants() {

    }

    @Test
    void addStudent() {
    }

    @Test
    void admitStudents() {
    }

    @Test
    void getStudents() {
    }

    @Test
    void expelStudents() {
    }

    @Test
    void getJss1Course() {
    }

    @Test
    void setJss1Course() {
    }

    @Test
    void getJss2Course() {
    }

    @Test
    void setJss2Course() {
    }

    @Test
    void getJss3Course() {
    }

    @Test
    void setJss3Course() {
    }

    @Test
    void getTeacherCourse() {
    }

    @Test
    void getStudentCourse() {
    }

    @Test
    void addNonTeachingStaff() {
    }

    @Test
    void getNonTeachingStaff() {
    }
}