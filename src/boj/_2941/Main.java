package boj._2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int count = 0;
        while(s.length()!=0) {
            count++;
            if(s.startsWith("c=") || s.startsWith("c-") || s.startsWith("d-") || s.startsWith("lj") || s.startsWith("nj")
                    || s.startsWith("s=") || s.startsWith("z=")) {
                s = s.substring(2);
            }
            else if(s.startsWith("dz=")) {
                s = s.substring(3);
            } else {
                s = s.substring(1);
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
