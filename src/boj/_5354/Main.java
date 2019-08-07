package boj._5354;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            int size = Integer.parseInt(br.readLine());

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(i==0 || i==size-1 || j==0 || j==size-1) {
                        bw.write('#');
                    } else {
                        bw.write('J');
                    }
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
