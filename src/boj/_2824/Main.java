package boj._2824;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> nList = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(n-->0) {
            nList.addAll(primeFactors(Integer.parseInt(st.nextToken())));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while(m-->0) {
            mList.addAll(primeFactors(Integer.parseInt(st.nextToken())));
        }

        Map<Integer, Long> nMap = nList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> mMap = mList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Integer, Long> smallerMap;
        Map<Integer, Long> largerMap;

        if(nMap.size() > mMap.size()) {
            smallerMap = mMap;
            largerMap = nMap;
        } else {
            smallerMap = nMap;
            largerMap = mMap;
        }

        Set<Map.Entry<Integer, Long>> entries = smallerMap.entrySet();

        BigInteger gcd = BigInteger.ONE;

        for(Map.Entry<Integer, Long> entry : entries) {
            Integer key = entry.getKey();
            if(largerMap.containsKey(key)) {
                gcd = gcd.multiply(BigInteger.valueOf(key).pow(Math.toIntExact(Math.min(entry.getValue(), largerMap.get(key)))));
            }
        }

        String result = gcd.toString();
        result = result.length()>9?result.substring(result.length()-9):result;
        bw.write(result);
        bw.flush();
        bw.close();
    }

    private static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
