package boj._4999;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String m = br.readLine();
        bw.write(n.length()>=m.length()?"go":"no");
        bw.flush();
        bw.close();
    }
}
