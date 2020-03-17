package codewars.convert_string_to_camel_case;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior")); // returns "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior")); // returns "TheStealthWarrior"
        System.out.println(toCamelCase(""));
    }

    static String toCamelCase(String s){
        String[] split = s.split("-|_");
        return split[0].concat(Arrays.stream(split).skip(1).map(word-> word.substring(0, 1).toUpperCase() + word.substring(1)).reduce(String::concat).orElse(""));
    }
}
