import org.junit.Test;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class StudentTest {
    Student jeremy = new Student(12345678, "Jeremy");

    //nice
    public void add3Grades(Student student) {
        student.addGrade(50);
        student.addGrade(60);
        student.addGrade(80);
    }
    @Test
    public void testStudentId() {
        assertEquals(12345678, jeremy.getId());
    }
    @Test
    public void testStudentName() {
        assertEquals("Jeremy", jeremy.getName());
    }
    @Test
    public void testNullName() {
        assertNotNull(null, jeremy.getName());
    }
    @Test
    public void testEmptyName() {
        assertNotEquals("", jeremy.getName());
    }
    @Test
    public void testStudentGrade() {
        add3Grades(jeremy);

        Integer [] testGrades = {50, 60, 80};
        assertArrayEquals(testGrades, jeremy.getGrades().toArray(new Integer[testGrades.length]));
        assertArrayEquals(testGrades, jeremy.getGrades().toArray(new Integer[testGrades.length]));
    }
    @Test
    public void testStudentGradeAvg() {
        jeremy.addGrade(100);
        jeremy.addGrade(95);
        jeremy.addGrade(91);
        jeremy.addGrade(96);

        assertEquals(95.5, jeremy.getGradeAverage(), 0.00001);
    }
}