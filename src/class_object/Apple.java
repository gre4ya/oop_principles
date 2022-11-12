package class_object;

public class Apple {
    // default constructor is provided by Java to create zero arg object
    public Apple(){
        // Each time you create a new object, this bloc will execute
    }

    //instance variables - fields - states - attributes
    public String color; // null
    public double price; // 0.0
    public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
