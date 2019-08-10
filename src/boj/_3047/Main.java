package boj._3047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).sorted().toArray();
        char[] chars = br.readLine().toCharArray();
        for (char aChar : chars) {
            System.out.print(arr[(int)aChar-65]);
            System.out.print(" ");
        }
    }
}
