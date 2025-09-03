package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Category;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.repository.CategoryRepository;
import com.jacoEx.ecomsphere_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category insert(Category category) {
        return categoryRepository.save(category);
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
