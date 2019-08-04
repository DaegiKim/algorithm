package boj._15719;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    private static byte[] buffer = new byte[78888905];
    private static int next;
    private static int b;

    public static void main(String[] args) throws IOException {
        System.in.read(buffer, 0, buffer.length);

        long n = nextInt();

        long comp = BigDecimal.ONE
                .add(BigDecimal.valueOf(n-1))
                .multiply(BigDecimal.valueOf(n-1).divide(BigDecimal.valueOf(2), 1, RoundingMode.UP))
                .longValue();

        for (int i = 0; i < n; i++) {
            comp -= nextInt();
        }

        System.out.println(Math.abs(comp));
    }

    private static long nextInt() {
        long n = buffer[next++] - '0';
        while ((b = buffer[next++]) >= '0')
            n = (n * 10) + (b - '0');
        return n;
    }
}