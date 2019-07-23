package boj._10709;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int row = Integer.parseInt(line[0]);
        int col = Integer.parseInt(line[1]);

        int[][] arr = new int[row][col];


        for (int i = 0; i < row; i++) {
            String[] split = scanner.nextLine().split("");

            int minute = -1;

            for (int j = 0; j < split.length; j++) {
                if(split[j].equals("c")) {
                    arr[i][j] = 0;
                    minute = 0;
                } else {
                    if(minute >= 0) {
                        arr[i][j] = ++minute;
                    } else {
                        arr[i][j] = -1;
                    }
                }

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
