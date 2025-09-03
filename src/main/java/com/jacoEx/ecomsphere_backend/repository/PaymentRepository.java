package com.jacoEx.ecomsphere_backend.repository;

import com.jacoEx.ecomsphere_backend.entity.Payment;
import com.jacoEx.ecomsphere_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
