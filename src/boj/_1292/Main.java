package boj._1292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = 0;
        int loop = 0;
outer:  for (int i = 0; i < b; i++) {
            for (int j = 0; j < i+1; j++) {
                loop++;
                if(loop>=a && loop<= b) {
                    result += (i+1);
                }
                if(loop>b) {
                    break outer;
                }
            }
        }

        System.out.println(result);
    }
}
