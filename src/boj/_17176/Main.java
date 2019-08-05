package boj._17176;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String sortedEncryptedText = Arrays.stream(br.readLine().split(" "))
                .map(x -> {
                    int a = Integer.parseInt(x);
                    if (a >= 1 && a <= 26) {
                        return String.valueOf((char) (a + 64));
                    } else if (a >= 27 && a <= 52) {
                        return String.valueOf((char) (a + 70));
                    } else {
                        return " ";
                    }
                }).sorted().collect(Collectors.joining());

        String sortedPlainText = Arrays.stream(br.readLine().split("")).sorted().collect(Collectors.joining());

        if(sortedEncryptedText.equals(sortedPlainText)) {
            bw.write("y");
        } else {
            bw.write("n");
        }
        bw.flush();
        bw.close();
    }
}
