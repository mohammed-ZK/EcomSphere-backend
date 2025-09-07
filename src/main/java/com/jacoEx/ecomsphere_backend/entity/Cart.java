package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Cart_Item> cartItems;

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
//    public List< Cart_Item > getCartItems () {
//        return cartItems;
//    }
//
//    public void setUser (User user) {
//        this.user = user;
//    }
//
//    public void setCartItems (List< Cart_Item > cartItems) {
//        this.cartItems = cartItems;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
}

