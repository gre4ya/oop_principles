package oop_principles.polimorphysm;

public class Animal {



    public void eat(){
        System.out.println("Animal eats");
    }

    public void eat(String food){
        System.out.println("Animal eats " + food);
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }

}
