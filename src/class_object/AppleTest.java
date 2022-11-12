package class_object;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple(); // class_object.Apple@1540e19d
        Apple apple2 = new Apple(); // class_object.Apple@677327b6
        Apple apple3 = apple1;      // class_object.Apple@677327b6


        System.out.println(apple1); // class_object.Apple@1540e19d
        System.out.println(apple2); // class_object.Apple@677327b6
        apple1.color = "Red";
        apple2.color = "Green";
        apple2.price = 0.75;
        apple2.taste = "sour";
        System.out.println("The color of apple1 is " + apple1.color);
        System.out.println("The color of apple2 is " + apple2.color);
        System.out.println("The taste of apple2 is " + apple2.taste);
        System.out.println("The price of apple2 is " + apple2.price);

        System.out.println(apple1); // Apple{color='Red', price=0.0, taste='null'}
        System.out.println(apple2); // Apple{color='Green', price=0.75, taste='sour'}
    }
}
