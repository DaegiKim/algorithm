package boj._17173;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        String[] ki = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        List<Integer> kList = Arrays.stream(ki).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());

        int sum = IntStream.rangeClosed(1, n)
                .parallel()
                .filter(x -> isMultipleOfList(x, kList))
                .sum();

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

    private static boolean isMultipleOfList(int x, List<Integer> list) {
        for (Integer integer : list) {
            if(x%integer == 0) {
                return true;
            }
        }

        return false;
    }
}
