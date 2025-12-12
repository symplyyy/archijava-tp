package org.example.structural.tp.adapter1;

public class Demo {
    public static void main(String[] args) {
        OldPaymentGateway paymentGateway = new PaymentAdapter("API_KEY_123");
        paymentGateway.makePayment("ACC123456", 100.50);
    }
}

