package class_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CarsTest {
    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000.0);
        Car car2 =new Car("Black", "Tesla", "S", 2023, 20000.0);
        Car car3 =new Car("Beige", "Toyota", "Camry", 2018, 10000.0);
        Car car4 =new Car("Blue", "Tesla", "X", 2021, 13000.0);
        Car car5 =new Car("Black", "Audi", "A7", 2022, 15000.0);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println("\n-------Print each car--------\n");
        cars.forEach(System.out::println);

        /*
        Find the most expensive car
        Find the cheapest car
        Count how many colors are black
        Remove all the cars that has more or equals 20k
         */

        // Find the most expensive car
        Car mostExpensiveCar = cars.get(0);

        for (Car car : cars) {
            if(car.price > mostExpensiveCar.price) mostExpensiveCar = car;
        }
        System.out.println("The most expensive car is " + mostExpensiveCar);

        // Find the cheapest car
        Car theCheapestCar = cars.get(0);

        for (Car car : cars) {
            if(car.price < theCheapestCar.price) theCheapestCar = car;
        }
        System.out.println("The cheapest car is " + theCheapestCar);

        //Count how many colors are black
        int count = 0;
        for (Car car : cars) {
            if(car.color.equals("Black")) count++;
        }
        System.out.println("The are " + count + " black cars in the list");

        System.out.println("\n------Count Black cars with stream()------\n");

        System.out.println("The are " + cars.stream().filter(car -> car.color.equals("Black")).count() +
                " black cars in the list");

        //Count all the cars that are Blue or Beige or 2023 -> Expected: 3
        System.out.println("\n----Count Blue or Beige or 2023 cars with loop------\n");

        count = 0;
        for (Car car : cars) {
            if(car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023) count++;
        }
        System.out.println("The are " + count + " blue or beige color or 2023 cars in the list");

        System.out.println("\n----Count Blue or Beige or 2023 cars with stream()------\n");

        System.out.println("The are " + cars.stream().filter(car -> car.color.equals("Blue") || car.color.equals("Beige") ||
                car.year == 2023).count() + " blue or beige color or 2023 cars in the list");

        //Remove all the cars that are Tesla and print the size of the cars -> Expected: 3

        System.out.println("\n----Count cars that are not Tesla with stream()------\n");

        System.out.println("There are " + cars.stream().filter(car -> !car.make.equals("Tesla")).count() +
                " not Tesla cars.");


        cars.removeIf(c -> c.make.equals("Tesla"));

        cars.forEach(System.out::println);
        System.out.println(cars.size());

    }
}
