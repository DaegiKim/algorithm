package boj._10987;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("e");
        strings.add("i");
        strings.add("o");
        strings.add("u");

        long count = Arrays.stream(s.split("")).filter(strings::contains).count();
        System.out.println(count);
    }
}
