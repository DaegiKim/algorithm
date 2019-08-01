package boj._2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        BigDecimal a = new BigDecimal(split[0]);
        BigDecimal b = new BigDecimal(split[1]);
        BigDecimal v = new BigDecimal(split[2]);
        BigDecimal divide = v.add(b.negate()).divide(a.add(b.negate()), 0, RoundingMode.CEILING);
        System.out.println(divide);
    }
}
