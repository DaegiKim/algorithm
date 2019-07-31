package boj._10768;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(String.format("2015-%02d-%02d", 2, 18));
        Date date2 = sdf.parse(String.format("2015-%02d-%02d", m, d));

        int comp = date1.compareTo(date2);
        System.out.println(comp==0?"Special":comp>0?"Before":"After");
    }
}
