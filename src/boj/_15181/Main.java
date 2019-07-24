package boj._15181;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String s = scanner.nextLine();

            if(s.equals("#")) {
                break;
            }

            char[] chars = s.toCharArray();
            int prevNote = chars[0];

            String msg = "That music is beautiful.";

            for (int i = 1; i < chars.length; i++) {
                int currentNote = chars[i];
                if(currentNote > prevNote) {
                    int a = currentNote - prevNote;
                    if(a != 2 && a != 4 && a != 6) {
                        msg = "Ouch! That hurts my ears.";
                        break;
                    }
                } else {
                    int a  = prevNote - currentNote;
                    if(a != 1 && a != 3 && a != 5) {
                        msg = "Ouch! That hurts my ears.";
                        break;
                    }
                }
                prevNote = currentNote;
            }
            System.out.println(msg);
        }
    }
}
