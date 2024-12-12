package org.example.interfaceFoodOrder;

public class PaymentViaCOD implements IOrderPayment{
    @Override
    public void payment() {
        System.out.println("Payment will be done on delivery with cash");
    }
}
