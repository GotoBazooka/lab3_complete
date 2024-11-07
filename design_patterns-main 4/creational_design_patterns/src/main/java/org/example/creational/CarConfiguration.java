package org.example.creational;

import org.example.creational.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        // Create a basic car
        Car basicCar = new Car.Builder()
                .setEngine("2.0L")
                .setTransmission("Automatic")
                .setColor("Black")
                .build();

        // Create a luxury car
        Car luxuryCar = new Car.Builder()
                .setEngine("3.5L Turbo")
                .setTransmission("Automatic")
                .setInterior("Leather")
                .setColor("White")
                .setHasSunroof(true)
                .setHasGPS(true)
                .setHasSafetyPackage(true)
                .build();

        System.out.println(basicCar);
        System.out.println(luxuryCar);
    }
}
