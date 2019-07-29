package boj._10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        while(n-->0) {
            String[] s = br.readLine().split(" ");

            Person p = new Person();
            p.name = s[0];
            p.korean = Integer.parseInt(s[1]);
            p.english = Integer.parseInt(s[2]);
            p.mathematics = Integer.parseInt(s[3]);

            list.add(p);
        }

        list.sort(Person::compareTo);
        list.forEach(p -> System.out.println(p.name));
    }
}

class Person implements Comparable<Person> {
    String name;
    int korean;
    int english;
    int mathematics;

    @Override
    public int compareTo(Person o) {
        int k = Integer.compare(o.korean, this.korean);

        if(k!=0) {
            return k;
        } else {
            int e = Integer.compare(this.english, o.english);
            if(e!=0) {
                return e;
            } else {
                int m = Integer.compare(o.mathematics, this.mathematics);
                if(m!=0) {
                    return m;
                } else {
                    return this.name.compareTo(o.name);
                }
            }
        }
    }
}
