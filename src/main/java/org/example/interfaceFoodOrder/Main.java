package org.example.interfaceFoodOrder;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Dosa", 99, new OrderViaSwiggy(), new PaymentViaUPI());
        Order order2 = new Order("Paratha", 199, new OrderViaZomato(), new PaymentViaUPI());
        Order order3 = new Order("Sandwich", 199, new OrderViaSwiggy(), new PaymentViaCOD());
        Order order4 = new Order("Sev Puri", 149, new OrderViaZomato(), new PaymentViaCOD());
        order1.placeOrder();
        System.out.println();
        order2.placeOrder();
        System.out.println();
        order3.placeOrder();
        System.out.println();
        order4.placeOrder();
    }
}
