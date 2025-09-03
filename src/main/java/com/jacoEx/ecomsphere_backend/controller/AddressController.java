package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Address;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.service.AddessService;
import com.jacoEx.ecomsphere_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addess")
public class AddressController {

    @Autowired
    private AddessService addessService;

    @PostMapping()
    public Address insert(@RequestBody Address address) {
        return addessService.insert(address);
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
