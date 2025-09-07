package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

//    public Long getId () {
//        return id;
//    }
//
//    public Cart getCart () {
//        return cart;
//    }
//
//    public Product getProduct () {
//        return product;
//    }
//
//    public int getQuantity () {
//        return quantity;
//    }
//
//    public void setId (Long id) {
//        this.id = id;
//    }
//
//    public void setCart (Cart cart) {
//        this.cart = cart;
//    }
//
//    public void setProduct (Product product) {
//        this.product = product;
//    }
//
//    public void setQuantity (int quantity) {
//        this.quantity = quantity;
//    }
}
