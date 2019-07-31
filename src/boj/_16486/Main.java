package boj._16486;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    private static final BigDecimal PI = new BigDecimal("3.141592");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal d1 = new BigDecimal(br.readLine());
        BigDecimal d2 = new BigDecimal(br.readLine());
        System.out.println(d1.multiply(BigDecimal.valueOf(2)).add(PI.multiply(BigDecimal.valueOf(2)).multiply(d2)));
    }
}
