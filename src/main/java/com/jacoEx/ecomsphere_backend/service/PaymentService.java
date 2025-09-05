package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Payment;
import com.jacoEx.ecomsphere_backend.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;


    public Payment insert (Payment payment) {
        return paymentRepository.save(payment);
    }

    public List< Payment > getAllPayments () {
        return paymentRepository.findAll();
    }

    public Optional< Payment > getPaymentById (Integer id) {
        return paymentRepository.findById(id);
    }

    public Payment updatePayment (Integer id , Payment paymentDetails) {
        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("payment not found with id: " + id));
        payment.setAmount(paymentDetails.getAmount());
        payment.setMethod(paymentDetails.getMethod());
        payment.setSuccessful(paymentDetails.isSuccessful());
        return paymentRepository.save(payment);
    }

    public void deletePayment (Integer id) {
        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("payment not found with id: " + id));
        paymentRepository.delete(payment);
    }
}
