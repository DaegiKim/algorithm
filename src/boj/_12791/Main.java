package boj._12791;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Album {
    int year;
    String name;

    public Album(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%d %s", this.year, this.name);
    }
}

public class Main {
    static List<Album> list = new ArrayList<>();
    static {
        list.add(new Album(1967, "DavidBowie"));
        list.add(new Album(1969, "SpaceOddity"));
        list.add(new Album(1970, "TheManWhoSoldTheWorld"));
        list.add(new Album(1971, "HunkyDory"));
        list.add(new Album(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"));
        list.add(new Album(1973, "AladdinSane"));
        list.add(new Album(1973, "PinUps"));
        list.add(new Album(1974, "DiamondDogs"));
        list.add(new Album(1975, "YoungAmericans"));
        list.add(new Album(1976, "StationToStation"));
        list.add(new Album(1977, "Low"));
        list.add(new Album(1977, "Heroes"));
        list.add(new Album(1979, "Lodger"));
        list.add(new Album(1980, "ScaryMonstersAndSuperCreeps"));
        list.add(new Album(1983, "LetsDance"));
        list.add(new Album(1984, "Tonight"));
        list.add(new Album(1987, "NeverLetMeDown"));
        list.add(new Album(1993, "BlackTieWhiteNoise"));
        list.add(new Album(1995, "1.Outside"));
        list.add(new Album(1997, "Earthling"));
        list.add(new Album(1999, "Hours"));
        list.add(new Album(2002, "Heathen"));
        list.add(new Album(2003, "Reality"));
        list.add(new Album(2013, "TheNextDay"));
        list.add(new Album(2016, "BlackStar"));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-->0) {
            String[] split = br.readLine().split(" ");
            int start = Integer.parseInt(split[0]);
            int end = Integer.parseInt(split[1]);

            List<Album> collect = list.stream().filter(x -> x.year >= start && x.year <= end).collect(Collectors.toList());

            StringBuilder sb = new StringBuilder();
            sb.append(collect.size()).append('\n');
            collect.forEach(x->sb.append(x.toString()).append('\n'));
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
}
