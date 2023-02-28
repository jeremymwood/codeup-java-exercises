import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CohortTest {
//    A Cohort instance can add a Student to the List of students.
//        Student jeremy = new Student(123456789, "Jeremy");
//        Student kenzi = new Student(123456123, "Kenzi");
//        Cohort ymir = new Cohort();

        private Cohort emptyCohort = new Cohort();
        private Cohort notEmptyCohort = new Cohort();

    @Test
    public void makeCohort() {
        Student bob = new Student(123, "Bob");
        bob.addGrade(40);
        bob.addGrade(50);
        bob.addGrade(60);
        notEmptyCohort.addStudent(bob);

        Student sue = new Student(124, "Sue");
        sue.addGrade(60);
        sue.addGrade(70);
        sue.addGrade(80);
        notEmptyCohort.addStudent(sue);

        Student lou = new Student(125, "Lou");
        lou.addGrade(70);
        lou.addGrade(80);
        lou.addGrade(90);
        notEmptyCohort.addStudent(lou);

        System.out.println(notEmptyCohort.getStudents());

    }

//    @Test
//    public void testAddStudentsToCohort() {
//        ymir.addStudent(jeremy);
//        ymir.addStudent(kenzi);
////        System.out.println(ymir.getStudents());
//        //need assertion and to string
//    }
//    @Test
//    public void testGetCohortAvg() {
//        ymir.addStudent(jeremy);
//        ymir.addStudent(kenzi);
//
//        jeremy.addGrade(100);
//        jeremy.addGrade(60);
//        jeremy.addGrade(80);
//
//        kenzi.addGrade(100);
//        kenzi.addGrade(95);
//        kenzi.addGrade(90);
//
//        assertEquals(87.5, ymir.getCohortAverage(), 0.000001);
//    }
}
