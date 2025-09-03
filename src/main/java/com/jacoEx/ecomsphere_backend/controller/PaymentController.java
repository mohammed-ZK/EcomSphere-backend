package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Payment;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.service.PaymentService;
import com.jacoEx.ecomsphere_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping()
    public Payment insert(@RequestBody Payment payment) {
        return paymentService.insert(payment);
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
