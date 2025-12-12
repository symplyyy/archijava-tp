package org.example.structural.tp.adapter2;

public class NotificationAdapter implements SmsService {
    private EmailService emailService;

    public NotificationAdapter() {
        emailService = new EmailService();
    }

    @Override
    public void sendSms(String number, String message) {
        String email = number + "@example.com";
        emailService.sendEmail(email, "Notification", message);
    }
}

