package playtime;

import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class FighterTest {
    Fighter noName = new Fighter("Unknown fighter");
    Fighter bob = new Fighter("bob");

    @Test
    public void testAlwaysTrue() {
        assertTrue(true);
    }

    @Test
    public void testAlwaysFalse() {
        assertFalse(false);
    }

    @Test
    public void testFighterNameGetter() {
        Fighter f1 = new Fighter("bob");

//        assertEquals(expected, actual);
        assertEquals("bob", f1.getName());
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfDoubleIsCorrect() {
        double x = 0;
        x += 0.1;
        x += 0.1;
        x += 0.1;

        assertEquals(0.3, x, 0.00001);
//        assertEquals(0.3, x);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Fighter anotherFighter = new Fighter();
        Fighter newFighter = null;
        assertNull(null);
        System.out.println(anotherFighter.getName());
        assertNotNull(anotherFighter);
        //is null, fails
//        assertNotNull(newFighter);

        //don't clutter tests, each test should test a specific case.
    }
    @Test
    public void testNoNameHitsBob9() {
        System.out.println(bob.getHealth());
        noName.hit(bob);
        System.out.println(bob.getHealth());
        assertEquals(90, bob.getHealth());
    }

}