package boj._4458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            String s = br.readLine();
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        }
    }
}
