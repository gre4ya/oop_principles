package oop_principles.abstraction;

public class Nokia extends Phone implements Camera{

    public Nokia() {
    }

    public Nokia(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("Nokia way to call");
    }

    @Override
    public void text() {
        System.out.println("Nokia way to text");
    }

    @Override
    public void takesPhoto() {
        System.out.println("Nokia way to take photos");
    }

    @Override
    public void recordVideos() {
        System.out.println("Nokia way to record videos");
    }
}
