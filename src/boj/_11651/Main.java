package boj._11651;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<XY> list = new ArrayList<>(n);
        while(n-->0) {
            String[] split = br.readLine().split(" ");
            XY xy = new XY();
            xy.x = Integer.parseInt(split[0]);
            xy.y = Integer.parseInt(split[1]);

            list.add(xy);
        }

        list.sort(XY::compareTo);

        for (XY xy : list) {
            bw.write(String.format("%d %d\n", xy.x, xy.y));
        }

        bw.flush();
        bw.close();
    }
}

class XY implements Comparable<XY> {
    int x;
    int y;

    @Override
    public int compareTo(XY o) {
        int comp = Integer.compare(this.y, o.y);
        return comp != 0 ? comp : Integer.compare(this.x, o.x);
    }
}