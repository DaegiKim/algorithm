package boj._15813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        System.out.println(
                Arrays.stream(br.readLine().split(""))
                        .parallel()
                        .map(x->x.charAt(0)-64)
                        .reduce(Integer::sum).orElse(0)
        );
    }
}
