package leetcode.n_repeated_element_in_size_2n_array;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
//        int[] arr = {5,1,5,2,5,3,5,4};
        int[] arr = {2,1,2,5,3,2};
        Solution solution = new Solution();
        System.out.println(solution.repeatedNTimes(arr));
    }

    public int repeatedNTimes(int[] A) {
        return Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a->a.getValue()>=2)
                .findFirst()
                .get()
                .getKey();
    }
}
