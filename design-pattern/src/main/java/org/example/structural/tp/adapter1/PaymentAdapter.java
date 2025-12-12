package org.example.structural.tp.adapter1;

public class PaymentAdapter implements OldPaymentGateway {
    private NewPaymentProcessor processor;
    private String key;

    public PaymentAdapter(String key) {
        this.key = key;
        processor = new NewPaymentProcessor(key);
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        processor.authenticate(key);
        processor.sendPayment(amount);
    }
}

