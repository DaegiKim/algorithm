package boj._10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine().trim();

        StringTokenizer st = new StringTokenizer(s, " ");

        Set<Integer> set = new HashSet<>();

        while(n-->0) {
            set.add(Integer.valueOf(st.nextToken()));
        }

        System.out.println(set.stream().sorted().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
