package boj._2822;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int kth = kthSmallest(arr, 4);
        int sum = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= kth) {
                sum+=arr[i];
                result.add(i+1);
            }
        }

        System.out.println(sum);
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    private static int kthSmallest(int arr[], int k)
    {
        int[] sorted = new int[8];
        System.arraycopy(arr,0,sorted,0, sorted.length);

        Arrays.sort(sorted);
        return sorted[k-1];
    }
}
