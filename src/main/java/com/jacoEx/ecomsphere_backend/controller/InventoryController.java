package com.jacoEx.ecomsphere_backend.controller;

import com.jacoEx.ecomsphere_backend.entity.Inventory;
import com.jacoEx.ecomsphere_backend.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping()
    public Inventory insert(@RequestBody Inventory inventory) {
        return inventoryService.insert(inventory);
    }
    @GetMapping
    public List<Inventory> getAllInventorys() {
        return inventoryService.getAllInventorys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inventory> getInventoryById(@PathVariable Integer id) {
        return inventoryService.getInventoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Inventory updateInventory(@PathVariable Integer id, @RequestBody Inventory inventoryDetails) {
        return inventoryService.updateInventory(id, inventoryDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInventory(@PathVariable Integer id) {
        inventoryService.deleteInventory(id);
        return ResponseEntity.noContent().build();
    }
}
