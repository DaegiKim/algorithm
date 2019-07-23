package boj._15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            String[] split = br.readLine().trim().split(" ");
            bw.write(String.valueOf(Integer.parseInt(split[0]) + Integer.parseInt(split[1])));
            bw.write("\n");
        }

        bw.flush();
    }
}
