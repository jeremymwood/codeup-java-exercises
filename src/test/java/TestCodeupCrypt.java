import org.junit.Test;

import static org.junit.Assert.*;

public class TestCodeupCrypt {
//    focus on testing passwords
//    takes a string that is a pw
//    returns hashed pw string
//    replace vowels with w
//    test each vowel case with specific case
//    test no vowels

    @Test
    public void testHashPwEmpty() {
        assertEquals("", CodeupCrypt.hashPassword(""));
    }
    @Test
    public void testHashPwA() {
        assertEquals("4bc", CodeupCrypt.hashPassword("Abc"));
    }
    @Test
    public void testHashPwE() {
        assertEquals("3d", CodeupCrypt.hashPassword("Ed"));
    }
    @Test
    public void testHashPwI() {
        assertEquals("1'm", CodeupCrypt.hashPassword("I'm"));
    }
    @Test
    public void testHashPwO() {
        assertEquals("0f", CodeupCrypt.hashPassword("Of"));
    }
    @Test
    public void testHashPwU() {
        assertEquals("9r", CodeupCrypt.hashPassword("Ur"));
    }
    @Test
    public void testHashPwAllVowels() {
        assertEquals("3D9C4T10N", CodeupCrypt.hashPassword("EDUCATION"));
    }
    @Test
    public void testHashPwNoVowels() {
        assertEquals("Rhythm", CodeupCrypt.hashPassword("Rhythm"));
    }

}
