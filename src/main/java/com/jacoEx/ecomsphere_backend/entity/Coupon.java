package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "coupons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(unique = true)
    private String code;

    private BigDecimal discount;

//    private LocalDate expiryDate;

    private boolean active = true;

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public void setDiscount(BigDecimal discount) {
//        this.discount = discount;
//    }
//
////    public void setExpiryDate(LocalDate expiryDate) {
////        this.expiryDate = expiryDate;
////    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public BigDecimal getDiscount() {
//        return discount;
//    }
//
////    public LocalDate getExpiryDate() {
////        return expiryDate;
////    }
//
//    public boolean isActive() {
//        return active;
//    }
}

