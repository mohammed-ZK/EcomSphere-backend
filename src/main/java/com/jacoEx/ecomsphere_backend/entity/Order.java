package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    private BigDecimal totalAmount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Order_Item> orderItems;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

//    public Order (Long id , BigDecimal totalAmount , User user , Address address , List< Order_Item > orderItems , Payment payment , LocalDateTime createdAt , LocalDateTime updatedAt) {
//        this.id = id;
//        this.totalAmount = totalAmount;
//        this.user = user;
//        this.address = address;
//        this.orderItems = orderItems;
//        this.payment = payment;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }

    public Long getId () {
        return id;
    }

    public BigDecimal getTotalAmount () {
        return totalAmount;
    }

    public User getUser () {
        return user;
    }

    public Address getAddress () {
        return address;
    }

    public List< Order_Item > getOrderItems () {
        return orderItems;
    }

    public Payment getPayment () {
        return payment;
    }

    public LocalDateTime getCreatedAt () {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt () {
        return updatedAt;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setTotalAmount (BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setUser (User user) {
        this.user = user;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public void setOrderItems (List< Order_Item > orderItems) {
        this.orderItems = orderItems;
    }

    public void setPayment (Payment payment) {
        this.payment = payment;
    }

    public void setCreatedAt (LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt (LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

