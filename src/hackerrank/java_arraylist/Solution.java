package hackerrank.java_arraylist;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<List<Integer>> list = new ArrayList<>();
        while(n-->0) {
            int nElements = scanner.nextInt();
            List<Integer> elements = new ArrayList<>();
            while(nElements-->0) {
                int i = scanner.nextInt();
                elements.add(i);
            }
            list.add(elements);
        }

        int nQ = scanner.nextInt();

        while(nQ-->0) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;

            try {
                System.out.println(list.get(i).get(j));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
