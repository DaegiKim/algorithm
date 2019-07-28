package boj._1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String source = br.readLine();
        String target = br.readLine();

        int index = 0;
        int cnt = 0;
        while(true) {
            index = source.indexOf(target, index);

            if(index<0) {
                break;
            }

            index+=target.length();

            cnt++;
        }

        System.out.println(cnt);
    }
}
