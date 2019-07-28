package hackerrank.java_list;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        while(n-->0) {
            list.add(scanner.nextInt());
        }
        int nQ = scanner.nextInt();
        while(nQ-->0) {
            String s = scanner.next();
            switch (s) {
                case "Insert":
                    int index = scanner.nextInt();
                    int v = scanner.nextInt();
                    list.add(index, v);
                    break;
                case "Delete":
                    list.remove(scanner.nextInt());
                    break;
            }
        }

        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}