package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Address;
import com.jacoEx.ecomsphere_backend.repository.AddessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private final AddessRepository addessRepository;

    public AddressService (AddessRepository addessRepository) {
        this.addessRepository = addessRepository;
    }

    public Address insert (Address address) {
        return addessRepository.save(address);
    }

    public List< Address > getAllAddresses () {
        return addessRepository.findAll();
    }

    public Optional< Address > getAddressById (Integer id) {
        return addessRepository.findById(id);
    }

    public Address updateAddress (Integer id , Address addressDetails) {
        Address address = addessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("address not found with id: " + id));
        address.setCity(addressDetails.getCity());
        address.setCountry(addressDetails.getCountry());
        address.setState(addressDetails.getState());
        address.setStreet(addressDetails.getStreet());
//        address.setPhoneNumber(addressDetails.getPhoneNumber());
        address.setPostalCode(addressDetails.getPostalCode());
        address.setUser(addressDetails.getUser());

        return addessRepository.save(address);
    }

    public void deleteAddress (Integer id) {
        Address address = addessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("address not found with id: " + id));
        addessRepository.delete(address);
    }
}
