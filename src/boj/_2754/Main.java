package boj._2754;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<>();
        map.put("A", 4.0);
        map.put("B", 3.0);
        map.put("C", 2.0);
        map.put("D", 1.0);
        map.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");

        Double score = map.get(split[0]);
        if(split.length>1) {
            if(split[1].equals("+")) {
                score+=0.3;
            } else if(split[1].equals("-")) {
                score-=0.3;
            }
        }

        System.out.println(score);
    }
}
