package org.example.interfacePaymentGateway;

public class CreditCardPayment implements IPaymentGateway{

    @Override
    public String processPayment(Double amount) {
        return "Payment of " + amount + " processed via Credit Card.";
    }

    @Override
    public String refundPayment(String ID) {
        return "Refund for Transaction via credit card, ID: " + ID + " has been processed successfully.";
    }
}
