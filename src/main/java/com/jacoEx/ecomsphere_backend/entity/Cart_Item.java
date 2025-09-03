package com.jacoEx.ecomsphere_backend.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.math.BigDecimal;
//
//@Entity
//@Table(name = "cart_items")
////@Getter
////@Setter
////@NoArgsConstructor
////@AllArgsConstructor
////@Builder
//public class Cart_Item {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "cart_id", nullable = false)
//    private Cart cart;
//
////    @ManyToOne
////    @JoinColumn(name = "product_id", nullable = false)
//    private Product product;
//
////    @Column(nullable = false)
//    private Integer quantity;
//
////    @Column(nullable = false)
//    private BigDecimal price;
//
////    @PrePersist
////    @PreUpdate
//    public void updatePrice() {
//        if (product != null) {
//            this.price = product.getPrice();
//        }
//    }
//}
