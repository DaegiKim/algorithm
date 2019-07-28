package boj._1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while(n-->0) {
            String s = br.readLine();

            s = s.replaceAll("(.)\\1+", "$1");

            String[] split = s.split("");

            boolean isGroupWord = true;

            for (int i = 0; i < split.length; i++) {
                if(s.indexOf(split[i], i+1) >= 0) {
                    isGroupWord = false;
                    break;
                }
            }

            if(isGroupWord) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
