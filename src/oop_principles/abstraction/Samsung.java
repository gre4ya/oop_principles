package oop_principles.abstraction;

public class Samsung extends Phone implements Camera, WiFi{
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

    @Override
    public void takesPhoto() {
        System.out.println("Samsung way to take pictures");
    }

    @Override
    public void recordVideos() {
        System.out.println("Samsung way to record videos");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Samsung is able to connect to the WiFi");
    }
}
