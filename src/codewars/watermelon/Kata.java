package codewars.watermelon;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Kata {
    public static boolean divide(int weight) {
        int v = weight-2;
        return v>0 && v%2==0;
    }

    @Test
    public void test() {
        assertTrue(Kata.divide(4));
        assertFalse(Kata.divide(2));
        assertFalse(Kata.divide(5));
        assertTrue(Kata.divide(88));
        assertTrue(Kata.divide(100));
        assertFalse(Kata.divide(67));
        assertTrue(Kata.divide(90));
        assertTrue(Kata.divide(10));
        assertFalse(Kata.divide(99));
        assertTrue(Kata.divide(32));
    }
}
