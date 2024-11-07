package org.example;

import org.example.command.PlaceOrderCommand;
import org.example.handler.InventoryCheckHandler;
import org.example.handler.PaymentValidationHandler;
import org.example.payment.CreditCardPayment;


public class Main {
    public static void main(String[] args) {

        // object creation usefull for the payment
        Order order = new Order(1L, "John", "PENDING", 100);
        order.setStatus(String.valueOf(OrderStatus.PENDING));

        InventoryCheckHandler inventoryCheckHandler = new InventoryCheckHandler();
        PaymentValidationHandler paymentValidationHandler = new PaymentValidationHandler();
        PlaceOrderCommand orderCommand1 = new PlaceOrderCommand(order,inventoryCheckHandler,paymentValidationHandler);
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234567890123456");

        // verification
        if (order.isValid() && inventoryCheckHandler.isInventorySufficient(order)) {
            System.out.println("The order is valid.");

            if (paymentValidationHandler.handle(order)) {
                creditCardPayment.pay(order.getTotalAmount());
                orderCommand1.execute();

            }
            else{
                System.out.println("Payment cancelled.");
                orderCommand1.cancel();


            }
        } else {
            System.out.println("stock empty or wrong order ");
            orderCommand1.cancel();

        }
    }
}
