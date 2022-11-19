package java_memory_management;

import class_object.Car;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "Alex";
        String name3 = "John";
        String name4 = "John";
        String name5 = "JOHN";


        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        // creating String as a new object
        String name6 = new String("John"); // explicit creation of String

        // name1, name3, name4 and name6 having value of "John"
        System.out.println(name1 == name3); // true (compares LOCATION in HEAP not value)
        System.out.println(name1 == name6); // false (compares LOCATION in HEAP not value)
        System.out.println(name1.equals(name6)); // true (compares VALUE in HEAP not location)

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car2;
        System.out.println(car1 == car2); // false (compares LOCATION in HEAP not value)
        System.out.println(car1.equals(car2)); // false (compares LOCATION in HEAP not value)
        System.out.println(car2 == car3); // True (compares LOCATION in HEAP not value)
        System.out.println(car2.equals(car3)); // true (compares LOCATION in HEAP not value)




    }
}
