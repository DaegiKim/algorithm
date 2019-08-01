package boj._10936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new String(Base64.getDecoder().decode(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }
}
