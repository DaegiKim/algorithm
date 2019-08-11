package boj._1718;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] plain = br.readLine().toCharArray();
        char[] enc = br.readLine().toCharArray();
        int encLength = enc.length;

        StringBuilder sb = new StringBuilder(plain.length);
        for (int i = 0; i < plain.length; i++) {
            sb.append(vigenereCipher(plain[i], enc[i%encLength]));
        }
        System.out.print(sb.toString());
    }

    private static char vigenereCipher(char p, char c) {
        if(p==' ') return ' ';
        int ch = p-c;
        ch = ch <= 0 ? (ch+26) : ch;
        return (char)(ch+96);
    }
}
