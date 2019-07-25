package boj._5355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            String[] s = br.readLine().split(" ");

            double n = Double.parseDouble(s[0]);

            for (int i = 1; i < s.length; i++) {
                switch(s[i]) {
                    case "@": n*=3;
                        break;
                    case "%": n+=5;
                        break;
                    case "#": n-=7;
                        break;
                }
            }

            System.out.println(String.format("%.2f", n));
        }
    }
}
