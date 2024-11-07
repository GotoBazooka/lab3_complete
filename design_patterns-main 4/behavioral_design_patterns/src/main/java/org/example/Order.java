package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String customerName;
    private String status;
    private double totalAmount;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + id + " status updated to: " + newStatus);
    }

    public boolean isValid() {
        return customerName != null && !customerName.isEmpty() && totalAmount > 0;
    }

    public Object getItems() {
        return id;
    }


}

