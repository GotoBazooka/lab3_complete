
package org.example.payment;

import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStrategy {
    void pay(double amount);
    boolean isPaymentValid();
}

