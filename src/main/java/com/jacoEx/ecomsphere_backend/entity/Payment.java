package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private Order order;

    private BigDecimal amount;

    private String method;

//    private LocalDateTime paymentDate = LocalDateTime.now();

    private boolean successful;

    public void setId (Long id) {
        this.id = id;
    }

//    public void setOrder(Order order) {
//        this.order = order;
//    }

    public void setAmount (BigDecimal amount) {
        this.amount = amount;
    }

    public void setMethod (String method) {
        this.method = method;
    }

//    public void setPaymentDate(LocalDateTime paymentDate) {
//        this.paymentDate = paymentDate;
//    }

    public void setSuccessful (boolean successful) {
        this.successful = successful;
    }

    public Long getId () {
        return id;
    }

//    public Order getOrder() {
//        return order;
//    }

    public BigDecimal getAmount () {
        return amount;
    }

    public String getMethod () {
        return method;
    }

//    public LocalDateTime getPaymentDate() {
//        return paymentDate;
//    }

    public boolean isSuccessful () {
        return successful;
    }
}
