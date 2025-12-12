package org.example.structural.tp.adapter2;

public class EmailService {
    public void sendEmail(String email, String subject, String body) {
        System.out.println("Email envoyé à " + email + " - Sujet: " + subject + " - Message: " + body);
    }
}

