package leetcode.majority_element_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,2,2,2};
        System.out.println(new Solution().majorityElement(arr));
    }

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        List<Integer> list = new ArrayList<>();

        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a->a.getValue()>n)
                .forEach(a->list.add(a.getKey()));

        return list;
    }
}
