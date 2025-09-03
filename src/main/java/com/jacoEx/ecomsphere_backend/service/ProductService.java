package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Product;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.repository.ProductRepository;
import com.jacoEx.ecomsphere_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product insert(Product product){
        return productRepository.save(product);
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
