package boj._1158;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        LinkedList<Integer> list = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toCollection(LinkedList::new));
        List<Integer> result = new ArrayList<>();

        int index = k-1;

        while(n-->0) {
            result.add(list.remove(index));
            try { index = (index+k-1) % n; } catch (ArithmeticException ignored){ }
        }
        bw.write(String.format("<%s>", result.stream().map(String::valueOf).collect(Collectors.joining(", "))));
        bw.flush();
        bw.close();
    }
}