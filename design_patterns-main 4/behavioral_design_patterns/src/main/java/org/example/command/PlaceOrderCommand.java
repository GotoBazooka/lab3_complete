package org.example.command;

import org.example.Order;
import org.example.OrderStatus;
import org.example.handler.InventoryCheckHandler;
import org.example.handler.PaymentValidationHandler;

public class PlaceOrderCommand implements OrderCommand {
    private final Order order;

    public PlaceOrderCommand(Order order, InventoryCheckHandler inventoryCheckHandler, PaymentValidationHandler paymentValidationHandler) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Order placed successfully: " + order.getId());
        order.setStatus(String.valueOf(OrderStatus.DELIVERED));
    }

    @Override
    public void cancel() {
        System.out.println("Order canceled: "+ order.getId());
        order.setStatus(String.valueOf(OrderStatus.CANCELED));

    }
}
