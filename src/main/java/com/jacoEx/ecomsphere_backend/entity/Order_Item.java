package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    private BigDecimal price;

//    public Long getId () {
//        return id;
//    }
//
//    public Order getOrder () {
//        return order;
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
//    public BigDecimal getPrice () {
//        return price;
//    }
//
//    public void setId (Long id) {
//        this.id = id;
//    }
//
//    public void setOrder (Order order) {
//        this.order = order;
//    }
//
//    public void setProduct (Product product) {
//        this.product = product;
//    }
//
//    public void setQuantity (int quantity) {
//        this.quantity = quantity;
//    }
//
//    public void setPrice (BigDecimal price) {
//        this.price = price;
//    }

}

