package boj._2783;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        BigDecimal min = new BigDecimal(split[0]).divide(new BigDecimal(split[1]), 5, RoundingMode.HALF_UP);

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            String[] split1 = br.readLine().split(" ");
            BigDecimal num = new BigDecimal(split1[0]).divide(new BigDecimal(split1[1]), 5, RoundingMode.HALF_UP);

            if(num.compareTo(min) < 0) {
                min = num;
            }
        }
        System.out.println(min.multiply(BigDecimal.valueOf(1000)).setScale(2, RoundingMode.HALF_UP));
    }
}
