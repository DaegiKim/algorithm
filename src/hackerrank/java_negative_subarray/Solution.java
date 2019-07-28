package hackerrank.java_negative_subarray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>(n);

        while(n-->0) {
            list.add(scanner.nextInt());
        }
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                int sum = list.subList(i, j+1).stream().mapToInt(Integer::intValue).sum();
                if(sum<0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}