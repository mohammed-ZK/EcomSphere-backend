package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
    private String name;

//    @Column(length = 500)
    private String description;

//    @Column(nullable = false)
    private BigDecimal price;

//    @Column(nullable = false)
    private int stockQuantity;

    private String imageUrl;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

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

//    public Category getCategory () {
//        return category;
//    }
//
//    public void setCategory (Category category) {
//        this.category = category;
//    }
////    @ManyToOne
////    @JoinColumn(name = "category_id")
////    private Category category;
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public void setStockQuantity(int stockQuantity) {
//        this.stockQuantity = stockQuantity;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
////    public void setCategory(Category category) {
////        this.category = category;
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public int getStockQuantity() {
//        return stockQuantity;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }

//    public Category getCategory() {
//        return category;
//    }
}
