package boj._2789;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String[] split = word.split("");
        Arrays.stream(split).filter(s -> s.matches("[^CAMBRIDGE]")).forEach(System.out::print);
    }
}
