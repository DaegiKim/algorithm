package boj._15786;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //알파벳 수
        int M = scanner.nextInt(); //포스트잇 수

        String source = scanner.next(); //PPAP

        while(M-- > 0) {
            String target = scanner.next();

            int cnt = 0;
            int j = 0;
            int i = 0;
            for(; i<source.length(); i++) {
                for(; j<target.length(); j++) {
                    if(source.charAt(i)==target.charAt(j)) {
                        cnt++;
                        i++;
                        if(i>=source.length()) {
                            break;
                        }
                    }
                }
            }

            System.out.println(cnt==source.length()?true:false);
        }
    }
}