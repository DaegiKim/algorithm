package hackerrank.plus_minus;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        AtomicInteger countPos = new AtomicInteger();
        AtomicInteger countNeg = new AtomicInteger();
        AtomicInteger countZero = new AtomicInteger();

        Arrays.stream(arr).forEach(v -> {
            if(v>0) {
                countPos.addAndGet(1);
            }
            else if(v<0) {
                countNeg.addAndGet(1);
            }
            else {
                countZero.addAndGet(1);
            }
        });

        System.out.println((double)countPos.get()/arr.length);
        System.out.println((double)countNeg.get()/arr.length);
        System.out.println((double)countZero.get()/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
