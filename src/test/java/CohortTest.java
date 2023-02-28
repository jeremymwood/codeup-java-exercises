import org.junit.Test;
import org.apache.commons.lang3.StringUtils;

import static org.junit.Assert.assertEquals;


public class CohortTest {
//    A Cohort instance can add a Student to the List of students.
        Student jeremy = new Student(123456789, "Jeremy");
        Student kenzi = new Student(123456123, "Kenzi");
        Cohort ymir = new Cohort();
    @Test
    public void testAddStudentsToCohort() {
        ymir.addStudent(jeremy);
        ymir.addStudent(kenzi);
        System.out.println(ymir.getStudents());
        //need assertion and to string
    }
    @Test
    public void testGetCohortAvg() {
        ymir.addStudent(jeremy);
        ymir.addStudent(kenzi);

        jeremy.addGrade(100);
        jeremy.addGrade(60);
        jeremy.addGrade(80);

        kenzi.addGrade(100);
        kenzi.addGrade(95);
        kenzi.addGrade(90);

        assertEquals(87.5, ymir.getCohortAverage(), 0.000001);
    }
}
