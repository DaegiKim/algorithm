package boj._1100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        boolean isOddLine = true;

        for(int n=0; n<8; n++) {
            String line = scanner.nextLine();
            String[] split = line.split("");
            for(int i=0; i<split.length; i++) {
                if(isOddLine) {
                    if(i%2==0 && split[i].equals("F")) {
                        answer+=1;
                    }
                } else {
                    if(i%2==1 && split[i].equals("F")) {
                        answer+=1;
                    }
                }
            }
            isOddLine = !isOddLine;
        }

        System.out.println(answer);
    }
}
