package boj._17174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        int count = a;
        a/=b;

        while (a>=b) {
            count+=a;
            a/=b;
        }

        count+=a;

        System.out.println(count);
    }
}
