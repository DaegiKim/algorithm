package boj._5532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        double A = Double.parseDouble(br.readLine());
        double B = Double.parseDouble(br.readLine());
        double C = Double.parseDouble(br.readLine());
        double D = Double.parseDouble(br.readLine());

        int ac = (int) Math.ceil(A/C);
        int bd = (int) Math.ceil(B/D);

        int max = Math.max(ac,bd);

        System.out.println(L-max);
    }
}
