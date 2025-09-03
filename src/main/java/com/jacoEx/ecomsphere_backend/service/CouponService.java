package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Coupon;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.repository.CouponRepository;
import com.jacoEx.ecomsphere_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Coupon insert(Coupon coupon) {
        return couponRepository.save(coupon);
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
