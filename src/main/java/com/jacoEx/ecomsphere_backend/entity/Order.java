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

//    public User getUser () {
//        return user;
//    }
//
//    public Address getAddress () {
//        return address;
//    }
//
//    public List< Order_Item > getOrderItems () {
//        return orderItems;
//    }
//
//    public Payment getPayment () {
//        return payment;
//    }
//
//    public void setUser (User user) {
//        this.user = user;
//    }
//
//    public void setAddress (Address address) {
//        this.address = address;
//    }
//
//    public void setOrderItems (List< Order_Item > orderItems) {
//        this.orderItems = orderItems;
//    }
//
//    public void setPayment (Payment payment) {
//        this.payment = payment;
//    }
//    //    @Enumerated(EnumType.STRING)
////    private Order_Item status;
//
////    private LocalDateTime createdAt = LocalDateTime.now();
//
////    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
////    private List<Order_Item> orderItems;
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
////    public void setUser(User user) {
////        this.user = user;
////    }
//
//    public void setTotalAmount(BigDecimal totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
////    public void setStatus(Order_Item status) {
////        this.status = status;
////    }
//
////    public void setCreatedAt(LocalDateTime createdAt) {
////        this.createdAt = createdAt;
////    }
//
////    public void setOrderItems(List<Order_Item> orderItems) {
////        this.orderItems = orderItems;
////    }
//
//    public Long getId() {
//        return id;
//    }
//
////    public User getUser() {
////        return user;
////    }
//
//    public BigDecimal getTotalAmount() {
//        return totalAmount;
//    }
//
////    public Order_Item getStatus() {
////        return status;
////    }
//
////    public LocalDateTime getCreatedAt() {
////        return createdAt;
////    }
//
////    public List<Order_Item> getOrderItems() {
////        return orderItems;
////    }
}

