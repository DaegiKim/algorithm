package boj._2755;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, BigDecimal> map = new HashMap<>();
    static {
        map.put("A", BigDecimal.valueOf(4.0));
        map.put("B", BigDecimal.valueOf(3.0));
        map.put("C", BigDecimal.valueOf(2.0));
        map.put("D", BigDecimal.valueOf(1.0));
        map.put("F", BigDecimal.valueOf(0.0));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigDecimal total = BigDecimal.ZERO;
        BigDecimal divider = BigDecimal.ZERO;
        while(n-->0) {
            String[] split = br.readLine().split(" ");
            divider = divider.add(new BigDecimal(split[1]));

            BigDecimal score = getScore(split[2].split(""));
            total = total.add(score.multiply(new BigDecimal(split[1])));
        }

        System.out.println(total.divide(divider, 2, RoundingMode.HALF_UP));
    }

    private static BigDecimal getScore(String[] scoreAndSign) {
        BigDecimal bigDecimal = map.get(scoreAndSign[0]);

        if(scoreAndSign.length>1) {
            if(scoreAndSign[1].equals("+")) {
                bigDecimal = bigDecimal.add(new BigDecimal("0.3"));
            } else if(scoreAndSign[1].equals("-")) {
                bigDecimal = bigDecimal.add(new BigDecimal("0.3").negate());
            }
        }

        return bigDecimal;
    }
}
