
package org.example.payment;

import lombok.AllArgsConstructor;
import org.example.notification.EmailNotificationObserver;
import org.example.notification.NotificationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber; // Store the credit card number securely (masked)

    @Override
    public void pay(double amount) {
        // Simulate basic credit card payment processing
        System.out.println("Processing payment for $" + amount + " with credit card number (masked): XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4));

        // Simulate successful authorization
        System.out.println("Payment authorized successfully.");

        // Simulate capturing the payment (replace with actual payment processing logic)
        System.out.println("Captured $" + amount + " from credit card.");


        // Notification email when payment
        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(new EmailNotificationObserver());

        notificationService.notifyObservers("Order placed successfully!");
    }

    @Override
    public boolean isPaymentValid() {
        return true;
    }
}
