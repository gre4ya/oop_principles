package oop_principles.abstraction;

public class iPhone extends Phone{

    public iPhone() {
    }

    public iPhone(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone way to call");
    }

    @Override
    public void text() {
        System.out.println("iPhone way to text");
    }
}
