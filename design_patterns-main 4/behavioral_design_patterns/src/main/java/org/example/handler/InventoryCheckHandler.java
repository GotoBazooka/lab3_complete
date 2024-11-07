
package org.example.handler;

import org.example.Order;
import org.example.OrderStatus;


public class InventoryCheckHandler extends OrderValidationHandler {

    @Override
    public boolean handle(Order order) {
        if (isInventorySufficient(order)) {
            System.out.println("Inventory sufficient. Proceeding to next handler.");
            super.validate(order); // Proceed to the next handler
        } else {
            System.out.println("Inventory insufficient. Canceling order.");
            order.setStatus(String.valueOf(OrderStatus.CANCELED));

        }
        return false;
    }

    public boolean isInventorySufficient(Order order) {
        // Implement inventory check logic here
        // ...
        return true; // Replace with actual inventory check
    }
}