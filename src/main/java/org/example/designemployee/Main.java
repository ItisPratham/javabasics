package org.example.designemployee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Pratham", "Software Engineer");
        employee1.buyCar(CarType.Sedan, "Matte Black");
        employee1.display();
        System.out.println();

        Employee employee2 = new Employee("Nidip", "Civil Engineer");
        employee2.buyCar(CarType.SUV, "White");

        Car eCar = employee2.showCar();
        if (eCar != null) {
            eCar.displayCar();
        } else {
            System.out.println("No car owned");
        }
        System.out.println();
        Employee employee3 = new Employee("Jaiveer", "Student");
        employee3.display();
    }
}
