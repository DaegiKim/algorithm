package boj._1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);

        br.close();

        try {
            int D = C-B;
            int E = A/D;

            if(E<0) {
                throw new Exception("Error!");
            }
            System.out.println(A/D + 1);
        } catch (Exception ex) {
            System.out.println(-1);
        }
    }
}
