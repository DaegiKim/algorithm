package boj._3009;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        int n = 3;

        while (n-->0) {
            int x = scanner.nextInt();
            if(xSet.contains(x)) {
                xSet.remove(x);
            } else {
                xSet.add(x);
            }

            int y = scanner.nextInt();
            if(ySet.contains(y)) {
                ySet.remove(y);
            } else {
                ySet.add(y);
            }
        }

        System.out.println(xSet.iterator().next()+" "+ySet.iterator().next());
    }
}
