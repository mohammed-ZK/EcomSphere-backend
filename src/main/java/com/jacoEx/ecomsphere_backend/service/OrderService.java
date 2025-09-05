package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Order;
import com.jacoEx.ecomsphere_backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order insert (Order order) {
        return orderRepository.save(order);
    }

    public List< Order > getAllOrders () {
        return orderRepository.findAll();
    }

    public Optional< Order > getOrderById (Integer id) {
        return orderRepository.findById(id);
    }

    public Order updateOrder (Integer id , Order orderDetails) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("order not found with id: " + id));
        order.setTotalAmount(orderDetails.getTotalAmount());

        return orderRepository.save(order);
    }

    public void deleteOrder (Integer id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("order not found with id: " + id));
        orderRepository.delete(order);
    }
}
