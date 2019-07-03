package leetcode.roman_to_integer;

public class Solution {
    public int romanToInt(String s) {
        String[] split = s.split("");

        int sum = 0;
        String prev = "";
        String current = "";

        for (int i = 0; i < split.length; i++) {
            current = split[i];
            sum+=calc(current, prev);
            prev = current;
        }
        
        return sum;
    }

    private int calc(String current, String prev) {
        if(prev.equals("I") && current.equals("V")) {
            return 3;
        }
        else if(prev.equals("I") && current.equals("X")) {
            return 8;
        }
        else if(prev.equals("X") && current.equals("L")) {
            return 30;
        }
        else if(prev.equals("X") && current.equals("C")) {
            return 80;
        }
        else if(prev.equals("C") && current.equals("D")) {
            return 300;
        }
        else if(prev.equals("C") && current.equals("M")) {
            return 800;
        }
        else if(current.equals("M")) {
            return 1000;
        }
        else if(current.equals("D")) {
            return 500;
        }
        else if(current.equals("C")) {
            return 100;
        }
        else if(current.equals("L")) {
            return 50;
        }
        else if(current.equals("X")) {
            return 10;
        }
        else if(current.equals("V")) {
            return 5;
        }
        else if(current.equals("I")) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
