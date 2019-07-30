package boj._10995;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        String line = IntStream.range(0, i).mapToObj(n -> "*").collect(Collectors.joining(" "));
        for (int j = 0; j < i; j++) {
            String format = (j%2) == 0 ? "%s%s" : "%1s%s";
            bw.write(String.format(format,"",line));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
