package oop_principles.abstraction;

public class Samsung extends Phone{
    public Samsung(){}

    public Samsung(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung way to call");
    }

    @Override
    public void text() {
        System.out.println("Samsung way to text");
    }
}
