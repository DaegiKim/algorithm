package boj._2857;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String s = br.readLine();
            if(s.contains("FBI")) {
                list.add(String.valueOf(i));
            }
        }

        if(list.isEmpty()) {
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(String.join(" ", list));
        }
    }
}
