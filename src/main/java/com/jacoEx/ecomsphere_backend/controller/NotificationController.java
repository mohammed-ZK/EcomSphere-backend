package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Notification;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.service.NotificationService;
import com.jacoEx.ecomsphere_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping()
    public Notification insert(@RequestBody Notification notification) {
        return notificationService.insert(notification);
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
