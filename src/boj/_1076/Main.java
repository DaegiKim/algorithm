package boj._1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new BigInteger(getValue(br.readLine(), true) + getValue(br.readLine(), true)).multiply(new BigInteger(getValue(br.readLine(), false))));
    }

    private static String getValue(String color, boolean flag) {
        switch (color) {
            case "black":
                return flag ? "0" : "1";
            case "brown":
                return flag ? "1" : "10";
            case "red":
                return flag ? "2" : "100";
            case "orange":
                return flag ? "3" : "1000";
            case "yellow":
                return flag ? "4" : "10000";
            case "green":
                return flag ? "5" : "100000";
            case "blue":
                return flag ? "6" : "1000000";
            case "violet":
                return flag ? "7" : "10000000";
            case "grey":
                return flag ? "8" : "100000000";
            case "white":
                return flag ? "9" : "1000000000";
            default:
                return null;
        }
    }
}