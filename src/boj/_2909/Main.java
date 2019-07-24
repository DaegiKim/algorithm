package boj._2909;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double c = scanner.nextDouble();
        double k = scanner.nextDouble();

        int solution = (int) (Math.round((c/Math.pow(10,k))) * Math.pow(10,k));

        System.out.println(solution);
    }
}
