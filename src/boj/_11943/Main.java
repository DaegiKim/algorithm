package boj._11943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        String[] split1 = br.readLine().split(" ");
        int c = Integer.parseInt(split1[0]);
        int d = Integer.parseInt(split1[1]);
        System.out.println(Math.min(a+d, b+c));
    }
}
