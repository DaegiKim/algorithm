package boj._4344;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int num_of_students = scanner.nextInt();

            double scores[] = new double[num_of_students];
            for (int j = 0; j < num_of_students; j++) {
                scores[j] = scanner.nextDouble();
            }

            double avg = Arrays.stream(scores).average().getAsDouble();
            long count = Arrays.stream(scores).filter(v -> v > avg).count();

            double percentage = (double)count/num_of_students*100;

            System.out.printf("%.3f%%\n", percentage);
        }
    }
}
