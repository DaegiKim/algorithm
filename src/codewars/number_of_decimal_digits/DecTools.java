package codewars.number_of_decimal_digits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecTools {
    public static int Digits(long n) {
        return String.valueOf(n).length();
    }

    @Test
    public void Digits() {
        assertEquals(1,  DecTools.Digits(5l));
        assertEquals(5,  DecTools.Digits(12345l));
        assertEquals(10, DecTools.Digits(9876543210l));
    }
}
