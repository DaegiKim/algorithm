package boj._2442;

import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int length = n-i-1 + (2*(i+1)-1);
            bw.write(String.format("%"+length+"s\n", IntStream.range(0, (2*(i+1)-1)).mapToObj(a->"*").reduce(String::concat).orElse("")));
        }
        bw.flush();
        bw.close();
    }
}
