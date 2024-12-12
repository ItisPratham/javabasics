package org.example.designemployee;


public class Employee {
    private String name;
    private String designation;
    private Car car = null;//use list for multiple cars

    public Employee(String name, String designation){
        if(name == null || designation == null){
            System.out.println("Name as well as designation can not be empty");
            return;
        }
        this.name = name;
        this.designation = designation;
    }

    public void buyCar(CarType type, String color){
        this.car = new Car(type, color);
    }

    public Car showCar(){
        return car;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Designation: " + this.designation);
        if(car != null) {
            car.displayCar();
        }
        else{
            System.out.println("No car owned");
        }
    }
}
