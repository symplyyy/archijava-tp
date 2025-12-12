package org.example.structural.tp.adapter2;

public class Demo {
    public static void main(String[] args) {
        SmsService notificationService = new NotificationAdapter();
        notificationService.sendSms("0612345678", "Votre commande a été expédiée");
    }
}

