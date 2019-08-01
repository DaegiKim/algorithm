package boj._1350;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigDecimal c = new BigDecimal(Integer.parseInt(br.readLine()));

        BigDecimal result = BigDecimal.ZERO;
        while (st.hasMoreTokens()) {
            BigDecimal i = new BigDecimal(st.nextToken());
            result = result.add(
                    i.divide(c, 0, RoundingMode.CEILING).multiply(c)
            );
        }

        System.out.println(result);
    }
}
