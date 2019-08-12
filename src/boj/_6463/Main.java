package boj._6463;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while ((line=br.readLine())!=null) {
            bw.write(String.format("%5s -> %d", line, fact(Integer.parseInt(line))));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int fact(int n) {
        long divider = 1000000000000L;

        long result = 1L;
        for (int i = n; i >= 1; i--) {
            result = result * i;
            while (result%10==0) {
                result = result/10;
            }
            result = result%divider;
        }

        return (int) (result%10);
    }
}
