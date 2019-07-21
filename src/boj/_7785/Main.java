package boj._7785;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            if(s[1].equals("enter")) {
                set.add(s[0]);
            } else {
                set.remove(s[0]);
            }
        }

        List<String> list = new ArrayList<>(set);

        list.sort(Collections.reverseOrder());

        list.forEach(System.out::println);
    }
}
