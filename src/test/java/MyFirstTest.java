import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testCodeupString() {
        String codeup = "Codeup";
        assertSame("Codeup", codeup);
    }
//    @Test
//    public void testInt(int num) {
//        num = 5;
//        assertSame(5, num);
//    }
    @Test
    public void testEmptyStringArrayLists() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }
    @Test
    public void assertArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
    }
    @Test
    public void asserPHPContainsLetters() {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
    @Test
    public void asserNull() {
        String language = null;
        assertNull(language);

        language = "Java";
        assertNotNull(language);

    }


}
