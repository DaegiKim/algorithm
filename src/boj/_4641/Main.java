package boj._4641;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("-1")) {
            String[] split = s.split(" ");

            List<Integer> list = Arrays.stream(split)
                    .mapToInt(Integer::valueOf)
                    .boxed()
                    .collect(Collectors.toList());

            Set<Integer> set = new HashSet<>(list);

            set.remove(0);

            long count = list.stream().filter(i -> set.contains(i * 2)).count();

            System.out.println(count);
        }
    }
}
