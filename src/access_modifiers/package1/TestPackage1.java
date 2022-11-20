package access_modifiers.package1;

public class TestPackage1 {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println(h1); // access_modifiers.package1.Honda@1540e19d

        Tesla t1 = new Tesla();
        Toyota t01 = new Toyota(); // default/protected constructor can be accessed in the same package
        // Toyota t1 = new Toyota(); -> cannot be accessed as it is private constructor

        BMW b1 = new BMW();

    }
}
