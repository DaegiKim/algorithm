package boj._9536;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T  = Integer.parseInt(scanner.nextLine());

        while(T-->0) {
            String[] s = scanner.nextLine().split(" ");
            List<String> list = new ArrayList<>(Arrays.asList(s));

            while(true) {
                String line = scanner.nextLine();
                String[] s1 = line.split(" ");

                String word = s1[s1.length-1];

                if(word.contains("?")) {
                    break;
                } else {
                    while(list.contains(word)) {
                        list.remove(word);
                    }
                }
            }

            String join = String.join(" ", list);
            System.out.println(join);
        }
    }
}
