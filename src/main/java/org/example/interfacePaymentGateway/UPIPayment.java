package org.example.interfacePaymentGateway;

public class UPIPayment implements IPaymentGateway{
    @Override
    public String processPayment(Double amount) {
        return "Payment of " + amount + " processed via UPI.";
    }

    @Override
    public String refundPayment(String ID) {
        return "Refund for Transaction via UPI, ID: " + ID + " has been processed successfully.";
    }
}
