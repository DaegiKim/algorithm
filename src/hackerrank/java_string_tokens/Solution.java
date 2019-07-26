package hackerrank.java_string_tokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        if(s.trim().length()==0) {
            System.out.println(0);
        } else {
            String[] split = s.trim().split("[ !,?._'@]+");
            System.out.println(split.length);
            Arrays.stream(split).forEach(System.out::println);
        }


        scan.close();
    }
}