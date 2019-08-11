package boj._2153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        int sum = 0;
        for (char aChar : chars) {
            int intChar = aChar;
            if(intChar<=90) {
                intChar-=38;
            } else {
                intChar-=96;
            }
            sum+=intChar;
        }

        if(sum==1) {
            System.out.println("It is a prime word.");
        } else {
            System.out.println(BigInteger.valueOf(sum).isProbablePrime(10)?"It is a prime word.":"It is not a prime word.");
        }
    }
}
