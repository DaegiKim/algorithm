package hackerrank.between_two_sets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Integer s = a.get(a.size() - 1);
        Integer e = b.get(0);

        List<Integer> considers = new ArrayList<>();

outer:  for(int i=s; i<=e; i++) {
            for(Integer aa : a) {
                if(i % aa != 0) {
                    continue outer;
                }
            }

            considers.add(i);
        }

        List<Integer> result = new ArrayList<>();

outer:  for(Integer consider : considers) {
            for(Integer bb : b) {
                if(bb%consider != 0) {
                    continue outer;
                }
            }

            result.add(consider);
        }

        return result.size();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);


        bufferedReader.close();
    }
}
