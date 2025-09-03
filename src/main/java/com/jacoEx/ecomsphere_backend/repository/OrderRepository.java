package com.jacoEx.ecomsphere_backend.repository;

import com.jacoEx.ecomsphere_backend.entity.Order;
import com.jacoEx.ecomsphere_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
