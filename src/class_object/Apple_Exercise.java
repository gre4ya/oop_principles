package class_object;

import java.util.Arrays;

public class Apple_Exercise {
    public static void main(String[] args) {

        /*
        Create 3 Apple objects with below info

        apple1
        Red
        0.5
        Sweet

        apple2
        Yellow
        0.75
        Sweet

        apple3
        Green
        1.0
        Sour

        Print all the objects
         */

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "Sweet";

        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "Sweet";

        apple3.color = "Green";
        apple3.price = 1.0;
        apple3.taste = "Sour";

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

        System.out.println("-----------Apple Array----------");

        // store apples in array

        Apple[] apples = {apple1, apple2, apple3};
        System.out.println(Arrays.toString(apples));
        System.out.println(apples.length); // 3
        System.out.println(apples[1]); // Apple{color='Yellow', price=0.75, taste='Sweet'}
        System.out.println(apples[2].taste); // Sour

        // print how many apples are sweet

        int count = 0;
        for (Apple apple : apples) {
            if(apple.taste.equals("Sweet")) count++;
        }
        System.out.println(count); // 2

        System.out.println("-----------------Task-2-----------------");

        Apple[] arr = {
                new Apple("Yellow", 0.5, "Sour"),
                new Apple("Red", 0.75, "Sour"),
                new Apple("Green", 0.5, "Sour"),
                new Apple("Yellow", 1.0, "Sweet"),
                new Apple("Yellow", 1.5, "Sweet")
            };
        for (Apple apple : arr) {
            System.out.println(apple);
        }

        System.out.println("------Retrieve info of each object and print it------");

        for (Apple apple : arr) {
            System.out.println(apple.color);
            System.out.println(apple.price);
            System.out.println(apple.taste);
            System.out.println("-------------");
        }
    }
}
