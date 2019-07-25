package boj._1357;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String n = s[0];
        String m = s[1];

        System.out.println(rev(String.valueOf(rev(n) + rev(m))));
    }

    private static int rev(String n) {
        return Integer.valueOf(new StringBuilder(n).reverse().toString());
    }
}
