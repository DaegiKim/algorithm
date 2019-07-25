package boj._9933;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new HashSet<>();

        while(n-->0) {
            set.add(scanner.nextLine());
        }

        String solution = set.stream().filter(s->{
            StringBuilder sb = new StringBuilder(s);
            return set.contains(sb.reverse().toString());
        }).findFirst().orElse("");

        System.out.printf("%d %s", solution.length(), solution.charAt(solution.length()/2));
    }
}
