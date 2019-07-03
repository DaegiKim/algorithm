package leetcode.container_with_most_water;

public class Solution {
//    public int maxArea(int[] height) {
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < height.length-1; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                int current = Math.min(height[i], height[j]) * (j-i);
//                max = Math.max(current, max);
//            }
//        }
//
//        return max;
//    }

    public int maxArea(int[] height) {

        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length-1;

        while(l<r) {
            int current = Math.min(height[l], height[r]) * (r-l);
            max = Math.max(max, current);

            if(height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        Solution solution = new Solution();

        System.out.println(solution.maxArea(height));
    }
}
