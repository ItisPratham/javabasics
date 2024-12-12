package org.example.interfaceFoodOrder;

public class OrderViaSwiggy implements IOrderPlatform{
    @Override
    public void platform() {
        System.out.println("Swiggy will Deliver this");
    }
}
