package org.example.designemployee;

public class Car {
    private static int idCount = 1;
    private int id = 1;
    private CarType type;
    private String color;
    public Car(CarType type, String color){
        this.id = idCount++;
        this.type = type;
        this.color = color;
    }

    public void displayCar(){
        System.out.println("Id: " + this.id);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
    }

}