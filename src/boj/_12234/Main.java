package boj._12234;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] split = br.readLine().split(" ");
            int N = Integer.parseInt(split[0]);

            double X = Double.parseDouble(split[1]);
            double half = Math.ceil(X/2.0);

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            LinkedList<Integer> list = new LinkedList<>();

            while (N-->0) {
                list.add(Integer.valueOf(st.nextToken()));
            }

            Collections.sort(list);

            double count = 0.0;
            while (!list.isEmpty()) {
                count += calc(list, half, X);
            }

            bw.write(String.format("Case #%d: %.0f\n", i+1, count));
        }
        bw.flush();
        bw.close();
    }

    private static double calc(LinkedList<Integer> list, double half, double size) {
        if(list.size()>=2) {
            Integer min = list.removeFirst();
            Integer max = list.removeLast();

            if(min+max <=size) {
                return 1;
            } else {
                list.addFirst(min);
                return 1;
            }
        } else {
            if(list.removeFirst() <= half) {
                return 0.5;
            } else {
                return 1;
            }
        }
    }
}