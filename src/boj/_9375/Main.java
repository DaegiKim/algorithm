package boj._9375;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();

            while(n-->0) {
                String[] split = br.readLine().split(" ");
                map.merge(split[1], 1, Integer::sum);
            }

            int result = map.values().stream()
                    .map(a -> a+1)
                    .reduce((a,b) -> a*b)
                    .orElse(0);

            if(result==0) {
                bw.write(String.format("%d\n", 0));
            } else {
                bw.write(String.format("%d\n", result-1));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
