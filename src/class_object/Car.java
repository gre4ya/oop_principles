package class_object;

public class Car {

    // default constructor
    public Car(){

    }
    // instance variables
    public String color;
    public String make;
    public String model;
    public int year;
    public double price;

    // 5-args overloaded constructor
    public Car(String color, String make, String model, int year, double price) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
