package boj._17263;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        List<Integer> list = new ArrayList<>(i);
        while(i-->0) {
            list.add(scanner.nextInt());
        }
        System.out.println(list.parallelStream().mapToInt(Integer::intValue).max().orElse(0));
    }
}