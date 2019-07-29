package boj._17249;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replace("=", "");
        String[] split = s.split("(\\^0\\^)");

        int n = split[0].length()-1;
        int m = split[1].length()-1;

        System.out.println(String.format("%d %d", n, m));
    }
}
