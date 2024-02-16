package com.example.myfirstapp.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="inventoryId", nullable = false)
    private Inventory inventoryId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customerId;

}
