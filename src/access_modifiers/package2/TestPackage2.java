package access_modifiers.package2;

import access_modifiers.package1.Honda;

public class TestPackage2 {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println(h1); // access_modifiers.package1.Honda@1540e19d

        // Tesla t1 = new Tesla(); -> cannot be accessed as it is default class
    }
}
