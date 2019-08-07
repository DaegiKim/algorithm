package boj._1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>(Integer::compareTo);

        int size = 0;
        while(n-->0)  {
            set.add(Integer.valueOf(br.readLine()));

            size++;
            int index = (int) Math.floor(size/2);
            index = size%2==0?index-1:index;

            Object[] objects = set.toArray();
            System.out.println(objects[index]);
        }
    }
}
