package codewars.fold_an_array;

import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Kata {
    public static int[] foldArray(int[] array, int runs) {
        Deque<Integer> deque = Arrays.stream(array).boxed().collect(Collectors.toCollection(LinkedList::new));

        while (runs-->0) {
            Deque<Integer> nextDeque = new LinkedList<>();

            while (deque.size()>1) {
                nextDeque.add(deque.removeFirst()+deque.removeLast());
            }

            while (deque.size()>0) {
                nextDeque.add(deque.remove());
            }

            deque = nextDeque;
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void basicTests() {
        int[] input = new int[] { 1, 2, 3, 4, 5 };
        int[] expected = new int[] { 6, 6, 3 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.foldArray(input, 1)));

        expected = new int[] { 9, 6 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.foldArray(input, 2)));

        expected = new int[] { 15 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.foldArray(input, 3)));

        input = new int[] { -9, 9, -8, 8, 66, 23 };
        expected = new int[] { 14, 75, 0 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.foldArray(input, 1)));
    }
}
