package code_snippet;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    private static List<Integer> getPrimes(int K) {
        int[] arr = new int[K];

        for (int i = 2; i < K; i++) {
            arr[i] = i;
        }

        double sqrt = Math.sqrt(K);
        for (int i = 2; i < sqrt; i++) {
            for (int j = i+i; j < K; j+=i) {
                arr[j] = 0;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < K; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
