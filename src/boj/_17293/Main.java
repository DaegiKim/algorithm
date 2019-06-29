package boj._17293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = scanner.nextInt();
        int N = bottles;

        while(true) {
            switch (N) {
                case 0:
                    System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n", N, N);
                    System.out.printf("Go to the store and buy some more, %d %s of beer on the wall.\n\n", bottles, bottles==1?"bottle":"bottles");
                    break;
                case 1:
                    System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n", N, N);
                    System.out.printf("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
                    break;
                default:
                    System.out.printf("%d %s of beer on the wall, %d %s of beer.\n", N, N==1?"bottle":"bottles", N, N==1?"bottle":"bottles");
                    System.out.printf("Take one down and pass it around, %d %s of beer on the wall.\n\n", N-1, N-1==1?"bottle":"bottles");
                    break;
            }
            if(--N < 0) {
                break;
            }
        }
    }
}
