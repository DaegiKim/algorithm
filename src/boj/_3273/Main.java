package boj._3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());

        Set<Integer> set = Arrays.stream(split).parallel().mapToInt(Integer::valueOf).boxed().collect(Collectors.toSet());

        int count = 0;

        for (Integer next : set) {
            int target = x - next;
            if (set.contains(target)) {
                count++;
            }
        }

        System.out.println(count/2);
    }
}
