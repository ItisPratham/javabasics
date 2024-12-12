package org.example.interfaceFoodOrder;

public class OrderViaZomato implements IOrderPlatform{
    @Override
    public void platform() {
        System.out.println("Zomato will Deliver this");
    }
}
