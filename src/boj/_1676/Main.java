package boj._1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int i = Integer.parseInt(br.readLine().trim());

        final int count = countZero(i);

        System.out.println(count);
    }

    private static int countZero(int n) {
        final int FIVE = 5;
        final int result = n/FIVE;
        if(result>=FIVE) {
            return result + countZero(result);
        } else {
            return result;
        }
    }
}
