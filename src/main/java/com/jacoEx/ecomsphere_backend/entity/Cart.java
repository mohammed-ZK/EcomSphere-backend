package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "carts")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;

//    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
//    private List<Cart_Item> cartItems;

    public void setId(Long id) {
        this.id = id;
    }

//    public void setUser(User user) {
//        this.user = user;
//    }

//    public void setCartItems(List<Cart_Item> cartItems) {
//        this.cartItems = cartItems;
//    }

    public Long getId() {
        return id;
    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public List<Cart_Item> getCartItems() {
//        return cartItems;
//    }
}

