package boj._4504;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String input;
        while (!(input = br.readLine()).equals("0")) {
            int num = Integer.parseInt(input);

            bw.write(String.valueOf(num));
            if(num%n==0) {
                bw.write(" is a multiple of ");
            } else {
                bw.write(" is NOT a multiple of ");
            }
            bw.write(String.valueOf(n));
            bw.write(".");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
