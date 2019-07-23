package boj._8979;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int target = Integer.parseInt(split[1]);

        List<Nation> nations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Nation nation = new Nation(scanner.nextLine());
            nations.add(nation);
        }

        nations.sort(Nation::compareTo);

        Nation compareNation = nations.get(0);
        int rank = 1;

        for (int i = 0; i < nations.size(); i++) {
            Nation nation = nations.get(i);

            if(compareNation.compareTo(nation) != 0) {
                compareNation = nation;
                rank += i-rank+1;
            }

            if(nation.number == target) {
                System.out.println(rank);
                break;
            }
        }
    }
}

class Nation implements Comparable<Nation> {
    int number;
    private int gold;
    private int silver;
    private int bronze;

    Nation(String input) {
        String[] split = input.split(" ");
        number = Integer.parseInt(split[0]);
        gold = Integer.parseInt(split[1]);
        silver = Integer.parseInt(split[2]);
        bronze = Integer.parseInt(split[3]);
    }

    @Override
    public String toString() {
        return String.format("%d %d %d %d", number, gold, silver, bronze);
    }

    @Override
    public int compareTo(Nation o) {
        int gold = Integer.compare(this.gold, o.gold);

        if(gold != 0) {
            return -gold;
        } else {
            int silver = Integer.compare(this.silver, o.silver);

            if(silver != 0) {
                return -silver;
            } else {
                int bronze = Integer.compare(this.bronze, o.bronze);

                if(bronze != 0) {
                    return -bronze;
                }
            }
        }

        return 0;
    }
}
