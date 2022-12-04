package oop_principles.polimorphysm;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.eat();
        a1.eat("Meat");
        a1.sleep();

        Cat c1 = new Cat();
        c1.eat();
        c1.eat("Fish");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.eat("Bone");
        d1.sleep();
        d1.bark();

        System.out.println("-------------Up-casting-------------");

        Animal a2 = new Cat();
        Animal a3 = new Dog();

        a3.sleep(); // Dynamic polymorphism

        System.out.println("--------Down-casting-explicitly---------");

        // Cat cat = (Cat) new Animal();  // not proper way to do down-casting - ClassCastException

        Animal myDog = new Dog(); // up-casting
        Dog newDog = (Dog) myDog;

        newDog.bark();



    }
}
