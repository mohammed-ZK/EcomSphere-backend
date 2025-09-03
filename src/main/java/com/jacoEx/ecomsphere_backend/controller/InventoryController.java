package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Inventory;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.service.InventoryService;
import com.jacoEx.ecomsphere_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping()
    public Inventory insert(@RequestBody Inventory inventory) {
        return inventoryService.insert(inventory);
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
