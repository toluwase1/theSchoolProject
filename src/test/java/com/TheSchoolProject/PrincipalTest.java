package com.TheSchoolProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void getOffence() {
        Principal chika = new Principal("Chika", 2340, "Principal", "USA", "Male", "floor 1");
//        chika.getOffence();
        assertEquals("stealing", chika.getOffence());
    }

    @Test
    void validateAge() {
        Principal chika = new Principal("Chika", 2340, "Principal", "USA", "Male", "floor 1");
//        chika.validateAge();
        assertEquals(true, chika.validateAge(new Person("damilola", 5, "lola", "asajon", "male", 15)));
    }

    @Test
    void validateOffence() {
        Principal chika = new Principal("Chika", 2340, "Principal", "USA", "Male", "floor 1");
//        chika.validateOffence(new Person("damilola", 5, "lola", "asajon", "male", 15));
//        assertEquals("stealing", chika.validateOffence());
    }
}