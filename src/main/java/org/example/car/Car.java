package org.example.car;


public class Car {
    int carId;
    double fuelCapacity;
    String color;
    float mileage;
    IFuelUp iFuelUp;

    public Car(int carId, double fuelCapacity, String color, float mileage, IFuelUp iFuelUp){
        this.carId = carId;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.mileage = mileage;
        this.iFuelUp = iFuelUp;
    }

    void fuelUp(){
        iFuelUp.fuelUp();
    }
    public void display(){
        System.out.println("Car details are as follows: ");
        System.out.println("Fuel capacity : " + fuelCapacity);
        //System.out.println("Fuel type : " + iFuelUp.fuelType());
    }
}
