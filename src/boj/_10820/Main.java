package boj._10820;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = 100;
        while(loop-->0) {
            String line = br.readLine();
            if(line == null || line.isEmpty()) {
                continue;
            }

            char[] chars = line.toCharArray();

            int l = 0;
            int u = 0;
            int n = 0;
            int b = 0;

            for (char aChar : chars) {
                if (48 <= aChar && aChar <= 58) {
                    n++;
                } else if (65 <= aChar && aChar <= 90) {
                    u++;
                } else if (97 <= aChar && aChar <= 122) {
                    l++;
                } else {
                    b++;
                }
            }

            bw.write(String.format("%d %d %d %d\n", l, u, n, b));
        }
        bw.flush();
        bw.close();
    }
}
