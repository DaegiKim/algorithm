package boj._10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String head = str.substring(0, str.length()%2!=0 ? (str.length()/2)+1 : str.length()/2);
        String tail = str.substring(str.length()/2);

        tail = new StringBuilder(tail).reverse().toString();

        if(head.equals(tail)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
