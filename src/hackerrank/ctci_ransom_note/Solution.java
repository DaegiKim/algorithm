package hackerrank.ctci_ransom_note;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> mMap = new HashMap<>();
        Map<String, Integer> nMap = new HashMap<>();

        Arrays.stream(magazine).forEach(s -> mMap.merge(s, 1, Integer::sum));
        Arrays.stream(note).forEach(s -> nMap.merge(s, 1, Integer::sum));

        int matchCount = 0;
        for(Map.Entry<String, Integer> entry : nMap.entrySet()) {
            if(mMap.containsKey(entry.getKey())) {
                if(mMap.get(entry.getKey()) >= entry.getValue()) {
                    matchCount++;
                }
            }
        }

        if(matchCount == nMap.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
