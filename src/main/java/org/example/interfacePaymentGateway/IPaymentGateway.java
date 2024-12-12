package org.example.interfacePaymentGateway;

public interface IPaymentGateway {
    String processPayment(Double amount);
    String refundPayment(String ID);
}
