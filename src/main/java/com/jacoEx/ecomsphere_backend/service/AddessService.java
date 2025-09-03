package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Address;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.repository.AddessRepository;
import com.jacoEx.ecomsphere_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddessService {
    @Autowired
    private AddessRepository addessRepository;

    public Address insert(Address address) {
        return addessRepository.save(address);
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
