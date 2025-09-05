package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Coupon;
import com.jacoEx.ecomsphere_backend.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping()
    public Coupon insert(@RequestBody Coupon coupon) {
        return couponService.insert(coupon);
    }
    @GetMapping
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coupon> getCouponById(@PathVariable Integer id) {
        return couponService.getCouponById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Coupon updateCoupon(@PathVariable Integer id, @RequestBody Coupon couponDetails) {
        return couponService.updateCoupon(id, couponDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCoupon(@PathVariable Integer id) {
        couponService.deleteCoupon(id);
        return ResponseEntity.noContent().build();
    }
}
