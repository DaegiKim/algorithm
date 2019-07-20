package boj._1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        String s = Integer.toBinaryString(N);

        s = s.replaceAll("0","");

        System.out.println(s.length());
    }
}
