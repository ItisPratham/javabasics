package org.example.interfacePaymentGateway;

public class PayPalPayment implements IPaymentGateway{
    @Override
    public String processPayment(Double amount) {
        return "Payment of " + amount + " processed via PayPal.";
    }

    @Override
    public String refundPayment(String ID) {
        return "Refund for Transaction via PayPal, ID: " + ID + " has been processed successfully.";
    }
}
