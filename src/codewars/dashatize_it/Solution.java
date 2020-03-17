package codewars.dashatize_it;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class Solution {
    public static String dashatize(int num) {
        Stack<String> result = new Stack<>();

        String.valueOf(num).chars()
                .map(a -> a-48)
                .filter(a -> a>=0 && 9>=a)
                .forEach(integer -> {
                    if (integer % 2 == 1) {
                        if (result.size()>0 && !result.peek().equals("-")) {
                            result.push("-");
                        }
                        result.push(String.valueOf(integer));
                        result.push("-");
                    } else {
                        result.push(String.valueOf(integer));
                    }
                });

        if (result.peek().equals("-")) {
            result.pop();
        }

        return result.stream().reduce(String::concat).get();
    }

    @Test
    public void testBasic() {
        assertEquals("2-7-4", Solution.dashatize(274));
        assertEquals("5-3-1-1", Solution.dashatize(5311));
        assertEquals("86-3-20", Solution.dashatize(86320));
        assertEquals("9-7-4-3-02", Solution.dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", Solution.dashatize(0));
        assertEquals("1", Solution.dashatize(-1));
        assertEquals("28-3-6-9", Solution.dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", Solution.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", Solution.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", Solution.dashatize(-1111111111));
    }

}
