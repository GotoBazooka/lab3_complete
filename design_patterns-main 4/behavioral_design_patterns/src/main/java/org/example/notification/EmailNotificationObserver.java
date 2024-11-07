package org.example.notification;

public class EmailNotificationObserver implements Observer {
    @Override
    public void update(String message) {
        // Send an email with the message
        System.out.println("Sending email: " + message);
    }
}
