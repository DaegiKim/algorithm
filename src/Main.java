import java.util.*;

public class Main {
    public static void main(String[] args) {
    }
}

interface A {
    int a = 0;
    void print();
}

class B implements A {
    @Override
    public void print() {

    }
}

abstract class C implements A {
    public int a = 0;

    @Override
    public void print() {

    }
}

class D extends C {
}