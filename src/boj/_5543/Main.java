package boj._5543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min_burger_price = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int burger_price = scanner.nextInt();
            if(burger_price<min_burger_price) {
                min_burger_price = burger_price;
            }
        }

        int min_drink_price = Integer.MAX_VALUE;

        for (int i = 0; i < 2; i++) {
            int drink_price = scanner.nextInt();
            if(drink_price<min_drink_price) {
                min_drink_price = drink_price;
            }
        }

        System.out.printf("%d", min_burger_price+min_drink_price-50);
    }
}
