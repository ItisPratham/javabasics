package org.example.interfacePaymentGateway;

public class Main {
    public static void main(String[] args) {
        IPaymentGateway creditCard = new CreditCardPayment();
        IPaymentGateway payPal = new PayPalPayment();
        IPaymentGateway upi = new UPIPayment();

        System.out.println(creditCard.processPayment(100.0));
        System.out.println(payPal.processPayment(250.0));
        System.out.println(upi.processPayment(50.0));

        System.out.println(creditCard.refundPayment("CC12345"));
        System.out.println(payPal.refundPayment("PP12345"));
        System.out.println(upi.refundPayment("UPI12345"));
    }
}
