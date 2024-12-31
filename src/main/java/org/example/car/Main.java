package org.example.car;

public class Main {
    public static void main(String[] args) {
        Car electricCar = new Car(1, 47.9, "Matte Black", 13.2F, new IFuelUp() {
            @Override
            public void fuelUp() {

            }
        });
    }
}
