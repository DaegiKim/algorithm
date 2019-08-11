package code_snippet;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Palindrome {
    private static boolean isPalindrome(int n) {
        Deque<String> deque = new LinkedList<>(Arrays.asList(String.valueOf(n).split("")));

        boolean isPalindrome = true;
        while (deque.size()>1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
