package com.TheSchoolProject;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    School school = new School("Decagon");

    @Test
    void getStudentClass() {
        Students tolu = new Students("Thomas", 234, "Student", "Sangotedo", "Male", "jss1");
        assertEquals("jss1", tolu.getStudentClass());

    }



    @Test
    void getOffence() {
        Students tolu = new Students("Thomas", 234, "Student", "Sangotedo", "Male", "jss1");
        tolu.getOffence("Stealing");
        assertEquals("Stealing", tolu.getOffence("Stealing"));
    }

}