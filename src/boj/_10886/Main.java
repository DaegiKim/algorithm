package boj._10886;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(scanner.nextInt() == 1) {
                count++;
            }
        }
        System.out.println(count>n/2?"Junhee is cute!":"Junhee is not cute!");
    }
}
