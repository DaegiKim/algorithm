package boj._1181;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(scanner.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        list.sort((a,b)->{
            int integerResult =  Integer.compare(a.length(), b.length());
            if(integerResult==0) {
                return a.compareTo(b);
            } else {
                return integerResult;
            }
        });

        list.forEach(System.out::println);
    }
}
