package boj._11586;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        int command = scanner.nextInt();

        if(command==2) {
            list.stream()
                    .map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(System.out::println);
        } else {
            if(command==3) {
                Collections.reverse(list);
            }
            list.forEach(System.out::println);
        }
    }
}
