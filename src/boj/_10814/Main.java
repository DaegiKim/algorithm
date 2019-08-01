package boj._10814;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<KV> list = new ArrayList<>();

        StringTokenizer st;
        while(n-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            KV kv = new KV();
            kv.k = Integer.parseInt(st.nextToken());
            kv.v = st.nextToken();
            list.add(kv);
        }

        StringBuilder sb = new StringBuilder();
        list.parallelStream()
                .sorted(Comparator.comparingInt(x -> x.k))
                .forEachOrdered(x-> sb.append(String.format("%d %s\n", x.k, x.v)));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class KV {
    int k;
    String v;
}