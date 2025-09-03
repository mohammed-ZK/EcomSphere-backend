package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Coupon;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.service.CouponService;
import com.jacoEx.ecomsphere_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping()
    public Coupon insert(@RequestBody Coupon coupon) {
        return couponService.insert(coupon);
    }

//    @GetMapping()
//    public List<CartDto> getCarts() {
//        return cartService.getCarts();
//    }
//
//    @GetMapping("{id}")
//    public BaseResponse<CartDto> getCartById(@PathVariable Long id) {
//        return cartService.getCart(id);
//    }
//
//    @DeleteMapping("{id}")
//    public BaseResponse<Void> deleteCart(@PathVariable Long id){
//        return new BaseResponse<>();
//    }
}
