package boj._1620;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(scanner.nextLine(), i+1);
        }

        List<String> keyList = new ArrayList<>(map.keySet());

        for (int i = 0; i < m; i++) {
            String query = scanner.nextLine();
            if(Character.isDigit(query.charAt(0))) {
                System.out.println(keyList.get(Integer.parseInt(query)-1));
            } else {
                System.out.println(map.get(query));
            }
        }
    }
}
