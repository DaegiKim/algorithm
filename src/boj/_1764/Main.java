package boj._1764;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");

        int n = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);

        Map<String, Integer> map = new HashMap<>();

        while(n-->0) {
            map.merge(br.readLine(), 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> collect = map.entrySet().stream().filter(x -> x.getValue() >= 2).sorted(Comparator.comparing(Map.Entry::getKey)).collect(Collectors.toList());

        bw.write(String.valueOf(collect.size()));
        bw.newLine();

        for(Map.Entry<String, Integer> entry : collect) {
            bw.write(entry.getKey());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
