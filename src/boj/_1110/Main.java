package boj._1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nn = n<10?n*10+n:((n/10+n%10)%10)+(n%10)*10;

        int count = 1;

        while(nn!=n) {
            nn = (nn/10+nn%10)%10+(nn%10)*10;
            count++;
        }

        System.out.println(count);
    }
}
