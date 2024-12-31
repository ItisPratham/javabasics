package org.example.Exam_122_23su.ObjectsProgramming;

public class Main {
    public static void main(String[] args) {
        Restaurant r1 = new FastFoodRestaurant("McDonalds");
        r1.addFoodItem("Butter Paneer");
        r1.addFoodItem("Cheeseburger");
        r1.removeFoodItem("Butter Paneer");

        Restaurant r2 = new FastFoodRestaurant("Chipotle", "Mexican");
        r2.addFoodItem("Tacos");
        r2.addFoodItem("PadThai");
        r2.addFoodItem("Burrito");
        r2.addFoodItem("Burrito");
        r2.removeFoodItem("PadThai");

        System.out.println(r1.getName());// McDonalds
        System.out.println(r1.getCuisine()); // N/A
        System.out.println(r1.getMenu()); // [Cheeseburger]
        System.out.println(r1.getNumFoodItems()); // 1
        System.out.println(r2.getName()); // Chipotle
        System.out.println(r2.getCuisine()); // Mexican
        System.out.println(r2.getMenu()); // [Tacos, Burrito] -> order does not matter
        System.out.println( r2.getNumFoodItems()); // 2
        System.out.println(r1.hasMoreOptions(r2)); // false
        System.out.println(r1.makeReservation("8:00 pm"));

        System.out.println("/////////////////////////////////////////////");
        System.out.println("/////////////////////////////////////////////");

        Restaurant r3 = new DineInRestaurant("VariTea", "Continental", 4, 1200, 2300, 5);
        Restaurant r4 = new DineInRestaurant("Triton");
        Restaurant r5 = new DineInRestaurant("Swati", "Indian", 5, 1000, 2200, 50);

        // Print restaurant details
        System.out.println(r4.getName());
        System.out.println(r4.getCuisine());
        System.out.println(r3.getName());
        System.out.println(r3.getCuisine());

        // Add food items to the menu
        r4.addFoodItem("Pasta");
        r4.addFoodItem("Pizza");
        r3.addFoodItem("Burger");
        r3.addFoodItem("Salad");
        r5.addFoodItem("Dal");
        r5.addFoodItem("Paneer Butter Masala");
        r4.removeFoodItem("Pizza");

        System.out.println("Menu for " + r4.getName() + ": " + r4.getMenu());
        System.out.println("Menu for " + r3.getName() + ": " + r3.getMenu());
        System.out.println("Menu for " + r5.getName() + ": " + r5.getMenu());

        System.out.println(r4.hasMoreOptions(r3));
        System.out.println(r5.hasMoreOptions(r3));

        System.out.println(r4.makeReservation("1200")); // Successful reservation
        System.out.println(r4.makeReservation("2300")); // Unsuccessful

        for (int i = 0; i < 5; i++) {
            System.out.println(r3.makeReservation("1200"));
        }
        System.out.println(r3.makeReservation("1210"));// Unsuccessful
    }
}
