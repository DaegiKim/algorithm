package boj._10347;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        int poolLength = pool.length();
        String s;

        while(!(s=br.readLine()).equals("0")) {
            String[] split = s.split(" ");
            int n = Integer.parseInt(split[0]);
            String reversed = new StringBuilder(split[1]).reverse().toString();
            for(char c : reversed.toCharArray()) {
                bw.write(rotate(n, pool, c, poolLength));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static char rotate(int n, String pool, char c, int poolLength) {
        return pool.charAt((pool.indexOf(c)+n)%poolLength);
    }
}
