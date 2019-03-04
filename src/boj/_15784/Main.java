package boj._15784;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.nextLine();

        int[][] arr = new int[N][N];

        for(int i=0; i<N; i++) {
            String[] s1 = scanner.nextLine().split(" ");
            for(int j=0; j<N; j++) {
                if(i != X-1 && j != Y-1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = Integer.parseInt(s1[j]);
                }
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(arr[i][j]>arr[X-1][Y-1]) {
                    System.out.println("ANGRY");
                    return;
                }
            }
        }
        System.out.println("HAPPY");
    }
}

