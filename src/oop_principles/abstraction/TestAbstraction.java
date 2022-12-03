package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung();
        s1.call();
        s1.text();

        Samsung s2 = new Samsung(64, "Galaxy sS0", "Black", 700);


        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        iPhone i2 = new iPhone(264, "12 Pro Max", "White", 999);

        System.out.println(i2);
        System.out.println(s2);

    }
}
