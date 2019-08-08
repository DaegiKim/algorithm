package boj._7894;

import java.io.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            int k = Integer.parseInt(br.readLine());

            double result = 0.0d;

            for (int i = 1; i <= k; i++) {
                result+=log10(i);
            }

            bw.write(String.valueOf((int)result+1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
