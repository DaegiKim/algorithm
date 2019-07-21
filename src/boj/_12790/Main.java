package boj._12790;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int[] status = new int[8];

            for (int j = 0; j < status.length; j++) {
                status[j] = scanner.nextInt();
            }

            int hp = status[0] + status[4];
            int mp = status[1] + status[5];
            int at = status[2] + status[6];
            int df = status[3] + status[7];

            hp = hp<1 ? 1:hp;
            mp = mp<1 ? 1:mp;
            at = at<0 ? 0:at;

            System.out.printf("%d\n", hp + 5*mp + 2*at + 2*df);
        }
    }
}
