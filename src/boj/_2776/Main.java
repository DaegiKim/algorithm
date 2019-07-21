package boj._2776;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bi.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st;
            Set<Integer> set =new HashSet<>();
            int n = Integer.parseInt(bi.readLine());
            String line1 = bi.readLine();

            st = new StringTokenizer(line1, " ");

            for (int j = 0; j < n; j++) {
                set.add(Integer.valueOf(st.nextToken()));
            }

            int m = Integer.parseInt(bi.readLine());
            String line2 = bi.readLine();

            st = new StringTokenizer(line2, " ");

            for (int j = 0; j < m; j++) {
                if(set.contains(Integer.parseInt(st.nextToken()))) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
