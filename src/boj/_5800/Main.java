package boj._5800;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            sb.append("Class ").append(i+1).append("\n");

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(Integer.valueOf(st.nextToken()));
            }

            list.sort(Comparator.reverseOrder());

            int max = list.get(0);
            int min = list.get(list.size()-1);
            int largestGap = Integer.MIN_VALUE;

            for (int j = 0; j < n-1; j++) {
                int gap = list.get(j) - list.get(j+1);
                if(gap>largestGap) {
                    largestGap = gap;
                }
            }

            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(largestGap).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
