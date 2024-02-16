package com.example.myfirstapp.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventoryId;

//    @OneToMany(mappedBy = "inventoryId")
//    private List<Books> booksList;

    @OneToMany(mappedBy = "inventoryId")
    private List<Order> orderList;

}
