package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

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

//    public Payment (Long id , BigDecimal amount , String method , boolean successful , Order order , LocalDateTime createdAt , LocalDateTime updatedAt) {
//        this.id = id;
//        this.amount = amount;
//        this.method = method;
//        this.successful = successful;
//        this.order = order;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }

    public Long getId () {
        return id;
    }

    public BigDecimal getAmount () {
        return amount;
    }

    public String getMethod () {
        return method;
    }

    public boolean isSuccessful () {
        return successful;
    }

    public Order getOrder () {
        return order;
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

    public void setAmount (BigDecimal amount) {
        this.amount = amount;
    }

    public void setMethod (String method) {
        this.method = method;
    }

    public void setSuccessful (boolean successful) {
        this.successful = successful;
    }

    public void setOrder (Order order) {
        this.order = order;
    }

    public void setCreatedAt (LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt (LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
