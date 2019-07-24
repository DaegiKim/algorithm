package boj._3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n%42);
        }

        System.out.println(list.stream().mapToInt(Integer::intValue).distinct().count());
    }
}
