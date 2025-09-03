package com.jacoEx.ecomsphere_backend.repository;

import com.jacoEx.ecomsphere_backend.entity.Inventory;
import com.jacoEx.ecomsphere_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {
}
