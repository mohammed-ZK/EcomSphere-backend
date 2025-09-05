package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Coupon;
import com.jacoEx.ecomsphere_backend.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Coupon insert (Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public List< Coupon > getAllCoupons () {
        return couponRepository.findAll();
    }

    public Optional< Coupon > getCouponById (Integer id) {
        return couponRepository.findById(id);
    }

    public Coupon updateCoupon (Integer id , Coupon couponDetails) {
        Coupon coupon = couponRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("coupon not found with id: " + id));
        coupon.setActive(couponDetails.isActive());
        coupon.setCode(couponDetails.getCode());
        coupon.setDiscount(couponDetails.getDiscount());

        return couponRepository.save(coupon);
    }

    public void deleteCoupon (Integer id) {
        Coupon coupon = couponRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("coupon not found with id: " + id));
        couponRepository.delete(coupon);
    }
}
