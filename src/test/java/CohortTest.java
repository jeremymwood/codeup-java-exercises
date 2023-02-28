import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {
//    A Cohort instance can add a Student to the List of students.
    @Test
    public void testAddStudent() {
        Student jeremy = new Student(123456789, "Jeremy");
        Student kenzi = new Student(123456123, "Kenzi");
        Cohort ymir = new Cohort();
        ymir.addStudent(jeremy);
        ymir.addStudent(kenzi);
        System.out.println(ymir.getStudents());
    }
//    A Cohort instance can get the current List of students.
//    A Cohort instance can get the average, and it's being calculated correctly.
//    Go back to the StudentTest class and refactor the code to avoid any repetition in the test cases, the use of the @Before annotation will be useful to achieve this, do the same with this new CohortTest class if you find any code repetition as well.

}
