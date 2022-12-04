package oop_principles.polimorphysm;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {
        /*
        Alex, John
        'X', 'b'
        12
        4.5
        Scanner object
         */

        Object[] objects = {1, 2, 4.5, 10.33, 'X', "Alex", "John", new Scanner(System.in), new ArrayList<>(), new Dog(), new Animal()};


        double d = (Double) objects[2] + 5; // 9.5
        System.out.println(d);

        Dog dog = (Dog) objects[9];
        dog.bark();
        dog.sleep();

        ArrayList<String> names = (ArrayList<String>) objects[8];
        System.out.println(names.size()); // 0

    }
}
