package oop_principles.abstraction;

public class iPhone extends Phone implements Camera, WiFi{

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

    @Override
    public void takesPhoto() {
        System.out.println("iPhone way of taking photos");
    }

    @Override
    public void recordVideos() {
        System.out.println("iPhone way of recording video");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("iPhone is able to connect to the WiFi");
    }
}
