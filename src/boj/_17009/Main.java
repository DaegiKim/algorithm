package boj._17009;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[2];
        for (int i = 0; i < 6; i++) {
            int index = i/3;
            arr[index] += Integer.parseInt(br.readLine()) * (3 - (i%3));
        }
        bw.write(arr[0]>arr[1]?"A":arr[1]>arr[0]?"B":"T");
        bw.flush();
        bw.close();
    }
}
