package boj._11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<XY> list = new ArrayList<>();

        while (N-->0) {
            String[] s = br.readLine().split(" ");
            list.add(new XY(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }

        list.sort(XY::compareTo);

        list.forEach(System.out::println);
    }
}

class XY implements Comparable<XY> {
    private int x;
    private int y;

    XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.x, this.y);
    }

    @Override
    public int compareTo(XY o) {
        int compX = Integer.compare(this.x, o.x);

        if(compX != 0) {
            return compX;
        } else {
            return Integer.compare(this.y, o.y);
        }
    }
}
