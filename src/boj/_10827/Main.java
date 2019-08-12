package boj._10827;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        BigDecimal a = new BigDecimal(split[0]);
        BigDecimal b = new BigDecimal(split[1]);

        int digits = a.toString().length()-1;
        int index = a.toString().indexOf(".");
        int decimal = digits-index;

        char[] chars = a.multiply(BigDecimal.TEN.pow(decimal))
                .setScale(0)
                .pow(b.intValue()).toString().toCharArray();

        int indexOfDot = chars.length - decimal*b.intValue();

        if(indexOfDot<0) {
            bw.write("0.");
            for (int i = indexOfDot; i < 0; i++) {
                bw.write('0');
            }
            for (int i = 0; i < chars.length; i++) {
                bw.write(chars[i]);
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                if(i==indexOfDot) {
                    bw.write('.');
                    bw.write(chars[i]);
                } else {
                    bw.write(chars[i]);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
