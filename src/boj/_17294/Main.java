package boj._17294;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");

        if(split.length<=2) {
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        } else {
            int diff =  Integer.parseInt(split[0]) - Integer.parseInt(split[1]);

            boolean isNot = false;
            for (int i = 0; i < split.length-1; i++) {
                if(Integer.parseInt(split[i]) - Integer.parseInt(split[i+1]) != diff) {
                    isNot = true;
                    break;
                }
            }

            if(isNot) {
                System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
            } else {
                System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
            }
        }
    }
}
