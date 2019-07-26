package hackerrank.java_loops;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            int product = 1;
            for (int j = 1; j <= n; j++) {
                sum += product * b;
                product *= 2;
                System.out.printf("%d ", sum);
            }
            System.out.println();
        }
        in.close();
    }


}
