package boj._2810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        String seats = scanner.nextLine().replace("LL", "A");

        if(seats.substring(seats.length()-1).equals("A")) {
            System.out.println(seats.length()+1);
        } else {
            if(seats.contains("AS")) {
                System.out.println(seats.length()+1);
            } else {
                System.out.println(seats.length());
            }
        }
    }
}