package access_modifiers.package2;

import access_modifiers.package1.BMW;
import access_modifiers.package1.Honda;
import access_modifiers.package1.Toyota;

public class TestPackage2 {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println(h1); // access_modifiers.package1.Honda@1540e19d

        // Tesla t1 = new Tesla(); -> cannot be accessed as it is default class
        // Toyota t1 = new Toyota(); -> cannot be accessed as it is private constructor
        // Toyota t1 = new Toyota(); -> cannot be accessed as it is default/protected constructor

        BMW b1 = new BMW();
    }
}
