package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Address;
import com.jacoEx.ecomsphere_backend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addess")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping()
    public Address insert(@RequestBody Address address) {
        return addressService.insert(address);
    }
    @GetMapping
    public List<Address> getAllAddresss() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Integer id) {
        return addressService.getAddressById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable Integer id, @RequestBody Address addressDetails) {
        return addressService.updateAddress(id, addressDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Integer id) {
        addressService.deleteAddress(id);
        return ResponseEntity.noContent().build();
    }
}
