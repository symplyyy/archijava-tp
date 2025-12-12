package org.example.structural.tp.adapter1;

public class NewPaymentProcessor {
    private String apiKey;

    public NewPaymentProcessor(String apiKey) {
        this.apiKey = apiKey;
    }

    public void authenticate(String apiKey) {
        this.apiKey = apiKey;
    }

    public void sendPayment(double amount) {
        System.out.println("Paiement de " + amount + " effectué");
    }
}

