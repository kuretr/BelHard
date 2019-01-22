package com.company;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CarRunner {
    public static void main(String[] arsg){
        Supplier<Car> nameCar = new Supplier<Car>() {
            @Override
            public Car get() {
                Car newCar = new Car();
                return newCar;
            }
        };
        Consumer<Car> searchCar = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car.getName().equalsIgnoreCase("audi"));

            }
        };
        Car c1= nameCar.get();
        c1.setName("Shkoda");
        searchCar.accept(c1);
    }
}
