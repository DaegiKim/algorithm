package boj._3058;

import java.io.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            IntSummaryStatistics statistics = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).filter(x -> x % 2 == 0).summaryStatistics();
            bw.write(String.format("%d %d\n", statistics.getSum(), statistics.getMin()));
        }

        bw.flush();
        bw.close();
    }
}
