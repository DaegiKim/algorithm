package boj._3486;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numOfTestCases = scanner.nextInt();

        while (numOfTestCases-- > 0) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            int reversedSum = addNumbersWithReverse(firstNum, secondNum);
            System.out.println(reversedSum);
        }
    }

    private static int addNumbersWithReverse(int firstNum, int secondNum) {
        return reverse(reverse(firstNum) + reverse(secondNum));
    }

    private static int reverse(int source) {
        String reversedNum = new StringBuilder(String.valueOf(source)).reverse().toString();
        return Integer.parseInt(reversedNum);
    }
}
