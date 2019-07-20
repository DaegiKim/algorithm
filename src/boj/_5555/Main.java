package boj._5555;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int N = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            count += solve(str, s);
        }

        System.out.println(count);
    }

    private static int solve(String str, String s) {
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i);
            String s2 = s.substring(0, i);
            String compose = s1+s2;
            if(compose.contains(str)) {
                return 1;
            }
        }
        return 0;
    }
}
