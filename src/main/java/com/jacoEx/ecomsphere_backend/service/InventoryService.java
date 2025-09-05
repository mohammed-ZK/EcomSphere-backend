package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Inventory;
import com.jacoEx.ecomsphere_backend.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory insert (Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List< Inventory > getAllInventorys () {
        return inventoryRepository.findAll();
    }

    public Optional< Inventory > getInventoryById (Integer id) {
        return inventoryRepository.findById(id);
    }

    public Inventory updateInventory (Integer id , Inventory inventoryDetails) {
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("inventory not found with id: " + id));
        inventory.setQuantity(inventoryDetails.getQuantity());
        inventory.setReservedQuantity(inventoryDetails.getReservedQuantity());

        return inventoryRepository.save(inventory);
    }

    public void deleteInventory (Integer id) {
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("inventory not found with id: " + id));
        inventoryRepository.delete(inventory);
    }
}
