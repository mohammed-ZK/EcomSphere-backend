package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Cart;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.repository.CartRepository;
import com.jacoEx.ecomsphere_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart insert(Cart cart) {
        return cartRepository.save(cart);
    }

//    public List<CartDto> getCarts() throws Exception {
//
//        return cartDtos;
//    }
//
//    public BaseResponse<Void> deleteCart(Long id) throws Exception {
//        return baseResponse;
//    }
//
//    public BaseResponse<CartDto> getCart(Long id) throws Exception {
//        return baseResponse;
//
//    }
}
