package boj._1302;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        while(n-->0) {
            map.merge(br.readLine(), 1, Integer::sum);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> {
            int comp = Integer.compare(b.getValue(), a.getValue());
            return comp != 0 ? comp : a.getKey().compareTo(b.getKey());
        });

        bw.write(list.get(0).getKey());
        bw.flush();
        bw.close();
    }
}
