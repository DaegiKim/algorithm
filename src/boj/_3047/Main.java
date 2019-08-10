package boj._3047;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        String[] split = br.readLine().split(" ");

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(arr);

        char[] chars = br.readLine().toCharArray();
        for (char aChar : chars) {
            bw.write(String.valueOf(arr[(int)aChar-65]));
            bw.write(' ');
        }
        bw.flush();
        bw.close();
    }
}
