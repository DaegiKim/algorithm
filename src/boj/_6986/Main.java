package boj._6986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        LinkedList<Double> list = new LinkedList<>();

        while (n-->0) {
            list.add(Double.valueOf(br.readLine()));
        }
        Collections.sort(list);

        LinkedList<Double> result1 = new LinkedList<>(list.subList(k, list.size() - k));
        System.out.println(String.format("%.2f", result1.parallelStream().mapToDouble(Double::doubleValue).average().orElse(0)));

        for (int i = 0; i < k; i++) {
            result1.addFirst(result1.get(0));
        }

        for (int i = 0; i < k; i++) {
            result1.addLast(result1.get(result1.size()-1));
        }
        System.out.println(String.format("%.2f", result1.parallelStream().mapToDouble(Double::doubleValue).average().orElse(0)));
    }
}
