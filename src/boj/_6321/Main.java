package boj._6321;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n-->0) {
            bw.write(String.format("String #%d\n", ++count));
            String s = br.readLine();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                char next = (char)((((c+1) % 65)%26)+65);
                bw.write(next);
            }
            bw.newLine();
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
