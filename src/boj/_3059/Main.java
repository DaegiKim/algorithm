package boj._3059;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            int[] arr = new int[26];
            char[] chars = br.readLine().toCharArray();
            for(char c : chars) {
                int index = c-65;
                arr[index]++;
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) {
                    sum += i+65;
                }
            }

            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}