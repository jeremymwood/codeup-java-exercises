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
        jeremy.addGrade(100);
        String formattedGrade = jeremy.getGrades().toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        assertEquals("100", formattedGrade);
    }
//    test empty strings and null values
//    add grade
//    get average


}