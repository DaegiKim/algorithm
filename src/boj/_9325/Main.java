package boj._9325;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while(N-->0) {
            int car_price = scanner.nextInt();

            int options = scanner.nextInt();

            for(int i=0; i<options; i++) {
                int num_of_option = scanner.nextInt();
                int option_price = scanner.nextInt();

                car_price+=(num_of_option*option_price);
            }

            System.out.println(car_price);
        }
    }
}
