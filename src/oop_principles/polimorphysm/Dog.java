package oop_principles.polimorphysm;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    public void bark(){
        System.out.println("Dog barks");
    }
}
