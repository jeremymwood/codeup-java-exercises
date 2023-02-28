import org.junit.Test;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class StudentTest {
    Student jeremy = new Student(12345678, "Jeremy");

    @Test
    public void testStudentId() {
        assertEquals(12345678, jeremy.getId());
    }
    @Test
    public void testStudentName() {
        assertEquals("Jeremy", jeremy.getName());
    }
    @Test
    public void testStudentGrade() {
        jeremy.addGrade(50);
        jeremy.addGrade(60);
        jeremy.addGrade(80);

        Integer [] testGrades = {50, 60, 80};
        assertArrayEquals(testGrades, jeremy.getGrades().toArray(new Integer[testGrades.length]));
    }

//    test empty strings and null values
//    add grade
//    get average


}