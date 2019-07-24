package boj._17254;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        List<Keyboard> keyboardList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String c = scanner.next();

            Keyboard keyboard = new Keyboard();
            keyboard.a = a;
            keyboard.b = b;
            keyboard.c = c;

            keyboardList.add(keyboard);
        }

        keyboardList.sort(Keyboard::compareTo);

        keyboardList.forEach(k->System.out.print(k.c));
    }
}

class Keyboard implements Comparable<Keyboard> {
    int a;
    int b;
    String c;

    @Override
    public int compareTo(Keyboard o) {
        int bCompare = Integer.compare(this.b, o.b);
        if(bCompare != 0) {
            return bCompare;
        } else {
            return Integer.compare(this.a, o.a);
        }
    }
}
