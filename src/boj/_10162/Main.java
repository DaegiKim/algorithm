package boj._10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        int countA;
        int countB;
        int countC;

        countA = T/300;
        T%=300;

        countB = T/60;
        T%=60;

        countC = T/10;
        T%=10;

        if(T==0) {
            System.out.printf("%d %d %d", countA, countB, countC);
        } else {
            System.out.print(-1);
        }
    }
}
