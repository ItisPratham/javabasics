package org.example.interfaceFoodOrder;

public class PaymentViaUPI implements IOrderPayment{

    @Override
    public void payment() {
        System.out.println("Payment is done through UPI");
    }
}
