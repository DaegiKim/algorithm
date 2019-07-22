package boj._10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println(new BigInteger(a).add(new BigInteger(b)).toString());
    }
}
