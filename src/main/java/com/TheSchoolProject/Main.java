package com.TheSchoolProject;

public class Main {
    // This main method is the entry point for all java applications
    // code is executed sequentially, line by line here
    //Objects are runtime concepts which does not  exist until the application runs
    //methods do all of the work (the main method). That's the starting point of every java application
    public static void main(String[] args) {

        School school= new School("DECAGON");
        Students tolu = new Students("Thomas", 234, "Student", "Sangotedo", "Male", "jss1");
        Principal chika = new Principal("Chika Nwobi", 100, "Principal", "Male", "USA", "Room 500");
        Teachers daro = new Teachers("Oghenedaro", 2000, "Teacher", "Sangotedo", "Male");

        school.addStudent(tolu);
        daro.getTeacherClass();
        chika.getOffence();
        tolu.getStudentClass();
        chika.IntroduceYourself();



    }
}


//
//    Applicants Johnson = new Applicants(1,"Johnson","JSS1",14);
//    Applicants Grace = new Applicants(2,"Grace","SS1", 13);
//    Applicants JohnMary = new Applicants(1,"JohnMary","ttfdggshs",  14);
//    Applicants  EmmanuelPaul = new Applicants(5,"EmmanuelPaul","ggfghjjh", 12);
//    Applicants Okon = new Applicants(3,"Okon","ffghfdfghj", 19);
//        school.getApplicants().add(Johnson);
//                school.getApplicants().add(JohnMary);
//                System.out.println(school.getApplicants());
//                Principal Okorie = new Principal(1,"Okorie");
//                school.setPrincipal(Okorie);
//                school.getPrincipal().admit(Johnson);
//                school.getPrincipal().admit(Grace);
//                school.getPrincipal().admit(JohnMary);
//                school.getPrincipal().admit(EmmanuelPaul);
//                school.getPrincipal().admit(Okon);
//                System.out.println(school.getStudents());