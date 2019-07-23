package boj._10769;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String h = ":-\\)";
        String[] split = input.split(h);

        int happy = split.length-1;

        String s = ":-\\(";
        split = input.split(s);

        int sad = split.length-1;

        if(sad==0 && happy==0) {
            System.out.println("none");
        } else {
            System.out.println(happy>sad?"happy":happy<sad?"sad":"unsure");
        }
    }
}
