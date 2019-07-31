package boj._1235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        while(n-->0) {
            list.add(br.readLine());
        }

        int size = list.size();
        int length = list.get(0).length();

        for (int i = 0; i < length; i++) {
            int index = i;
            long count = list.stream().map(x -> x.substring(length - (index + 1))).distinct().count();
            if(count == size) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
