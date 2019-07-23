package boj._5217;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            List<String> list = solution(n);
            System.out.println(String.format("Pairs for %d: %s", n, String.join(", ", list)));
        }
    }

    private static List<String> solution(int number) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            int pair = number-i;

            if(i >=pair) {
                break;
            } else {
                list.add(String.format("%d %d", i, pair));
            }
        }

        return list;
    }
}
