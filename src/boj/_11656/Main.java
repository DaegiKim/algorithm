package boj._11656;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        List<String> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            list.add(str.substring(i));
        }

        list.sort(String::compareTo);

        list.forEach(System.out::println);
    }
}
