package boj._9324;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            char[] count = new char[26];
            char[] chars = br.readLine().toCharArray();

            boolean isFake = false;
            for (int i = 0; i < chars.length; i++) {
                int index = chars[i] - 'A';
                count[index]++;

                if(count[index]==3) {
                    if(i+1 < chars.length) {
                        if(chars[i+1] != chars[i]) {
                            isFake = true;
                            break;
                        } else {
                            count[index] = 0;
                            i++;
                        }
                    } else {
                        isFake=true;
                        break;
                    }
                }
            }


            bw.write(isFake?"FAKE":"OK");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
