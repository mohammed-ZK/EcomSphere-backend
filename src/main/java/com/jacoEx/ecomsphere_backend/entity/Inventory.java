package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "product_id")
//    private Product product;

    private int quantity;

    private int reservedQuantity;

//    public Inventory (Long id , int quantity , int reservedQuantity) {
//        this.id = id;
//        this.quantity = quantity;
//        this.reservedQuantity = reservedQuantity;
//    }

    public Long getId () {
        return id;
    }

    public int getQuantity () {
        return quantity;
    }

    public int getReservedQuantity () {
        return reservedQuantity;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public void setReservedQuantity (int reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }
}
