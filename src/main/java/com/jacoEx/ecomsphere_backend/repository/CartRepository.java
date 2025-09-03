package com.jacoEx.ecomsphere_backend.repository;

import com.jacoEx.ecomsphere_backend.entity.Cart;
import com.jacoEx.ecomsphere_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
}
