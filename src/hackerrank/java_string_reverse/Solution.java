package hackerrank.java_string_reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder sb = new StringBuilder(A);
        System.out.println(sb.reverse().toString().equals(A)?"Yes":"No");
    }
}