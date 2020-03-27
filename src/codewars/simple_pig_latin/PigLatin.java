package codewars.simple_pig_latin;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(word -> {
            if (!word.matches("^[A-Za-z]+$")) return word;

            String firstLetter = word.substring(0, 1);
            String rest = word.substring(1);

            return rest+firstLetter+"ay";
        }).reduce((a, b) -> String.join(" ", a, b)).orElse("");
    }

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
    }
}
