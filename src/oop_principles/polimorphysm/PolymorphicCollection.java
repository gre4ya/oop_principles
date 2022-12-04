package oop_principles.polimorphysm;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollection {
    public static void main(String[] args) {

        System.out.println("---------Animal object-------------");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat("Food");
        animal1.sleep();

        System.out.println("----------Cat object--------------");
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.eat("Chicken");
        cat1.sleep();
        cat1.meow();

        System.out.println("----------Dog object--------------");
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.eat("beef");
        dog1.sleep();
        dog1.bark();

        System.out.println("--------Cat object in the shape of Animal------");
        Animal animal2 = new Cat();
        animal2.sleep();
        animal2.eat();
        animal2.eat("fish");

        System.out.println("--------Dog object in the shape of Animal------");
        Animal animal3 = new Dog();
        animal3.sleep();
        animal3.eat();
        animal3.eat("bone");

        System.out.println("-------store all above objects in an array----------");
        Animal[] animals = {animal1, animal2, animal3, cat1, dog1};
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            animal.eat();
            animal.eat("str");
            animal.sleep();
        }

        System.out.println("-------store all above objects in an ArrayList----------");

        new ArrayList<Animal>(Arrays.asList(animals)).forEach(Animal::eat);



    }
}
