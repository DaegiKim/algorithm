package boj._16212;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>(n);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        list.sort(Integer::compareTo);

        StringBuilder sb = new StringBuilder(n*2);
        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
