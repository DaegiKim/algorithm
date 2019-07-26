package hackerrank.java_end_of_file;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while(scanner.hasNext()) {
            System.out.printf("%d %s\n", ++n, scanner.nextLine());
        }
    }
}