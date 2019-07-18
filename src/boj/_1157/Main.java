package boj._1157;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();

        Map<String, Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        String maxChar = "";
        long maxCount = Long.MIN_VALUE;
        int duplicateOfMax = 0;

        for(Map.Entry<String, Long> entry : collect.entrySet()) {
            if(maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
                duplicateOfMax = 0;
            } else if(maxCount == entry.getValue()) {
                duplicateOfMax += 1;
            }
        }

        if(duplicateOfMax!=0) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}
