package org.example.handler;

import org.example.Order;
import org.example.OrderStatus;
import org.example.notification.EmailNotificationObserver;
import org.example.notification.NotificationService;

public class PaymentValidationHandler extends OrderValidationHandler {

    @Override
    public boolean handle(Order order) {
        if (true) {
            System.out.println("Le paiement est valide. Traitement suivant...");
            super.validate(order); // Passe au prochain handler
            return true;
        } else {

            NotificationService notificationService = new NotificationService();
            notificationService.addObserver(new EmailNotificationObserver());
            notificationService.notifyObservers("payment refused !");

            order.setStatus(String.valueOf(OrderStatus.CANCELED));
            return false;
        }

    }
}
