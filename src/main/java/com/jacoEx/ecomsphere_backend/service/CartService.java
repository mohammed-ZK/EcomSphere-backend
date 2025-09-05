package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Cart;
import com.jacoEx.ecomsphere_backend.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart insert (Cart cart) {
        return cartRepository.save(cart);
    }

    public List< Cart > getAllCarts () {
        return cartRepository.findAll();
    }

    public Optional< Cart > getCartById (Integer id) {
        return cartRepository.findById(id);
    }

    public Cart updatecart (Integer id , Cart cartDetails) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("cart not found with id: " + id));
        return cartRepository.save(cart);
    }

    public void deleteCart (Integer id) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("cart not found with id: " + id));
        cartRepository.delete(cart);
    }
}
