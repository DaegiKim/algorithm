package boj._9971;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while(!(line = br.readLine()).equals("ENDOFINPUT")) {
            if (!line.equals("START") && !line.equals("END")) {
                char[] chars = line.toCharArray();
                for(char c : chars) {
                    if(c>=65 && c<=90) {
                        bw.write(Character.toChars(c-5 >= 65 ? c-5 : 90+(c-5-65+1)));
                    } else {
                        bw.write(c);
                    }
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
