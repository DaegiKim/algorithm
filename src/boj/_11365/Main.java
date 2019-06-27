package boj._11365;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String s = scanner.nextLine();

            if(s.equals("END")) {
                break;
            }

            String[] split = s.split("");
            for(int i=split.length-1; i>=0; i--) {
                System.out.print(split[i]);
            }
            System.out.println();
        }
    }
}
