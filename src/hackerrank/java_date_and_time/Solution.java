package hackerrank.java_date_and_time;

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        String[] weekdays = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return weekdays[i-1];
    }
}
