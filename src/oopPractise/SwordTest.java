package oopPractise;

public class SwordTest {
    public static void main(String[] args) {

        System.out.println("Sword 1 is created after this line");
       // Sword sword1 = new Sword(); // default constructor
        Sword sword1 = new Sword("Iron"); // modified constructor
        System.out.println(sword1);

        System.out.println("Sword 2 is created after this line");
        Sword sword2 = new Sword(3.5, 15.0, "LongSword", "Iron"); // modified constructor
        System.out.println(sword2);

        Sword sword3 = new Sword(10, 25, "superLong Sword", "titanium");

        System.out.println("\nWorking with static values\n");

        System.out.println("hasHandle " + Sword.hasHandle);
        System.out.println("isSharp before " + Sword.isSharp);
        System.out.println(Sword.isSharp);
        Sword.damage();

        Sword.isSharp = true;
        System.out.println("isSharp after " + Sword.isSharp);
        Sword.damage();

        Sword.slash();

        System.out.println("\nWorking with non-static methods\n");

        sword1.harms(); // 0.0
        sword2.harms(); // 3.5 * 15 = 52.5
        sword3.harms(); // 10 * 25 = 250.0




    }
}
