package boj._11728;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        List<Integer> list = new ArrayList<>(n+m);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(st.nextToken()));

        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        list.sort(Integer::compareTo);
        StringBuilder sb = new StringBuilder((n+m)*2);

        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
