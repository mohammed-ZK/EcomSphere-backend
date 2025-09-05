package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Notification;
import com.jacoEx.ecomsphere_backend.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification insert (Notification notification) {
        return notificationRepository.save(notification);
    }

    public List< Notification > getAllNotifications () {
        return notificationRepository.findAll();
    }

    public Optional< Notification > getNotificationById (Integer id) {
        return notificationRepository.findById(id);
    }

    public Notification updateNotification (Integer id , Notification notificationDetails) {
        Notification notification = notificationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("notification not found with id: " + id));

//        notification.setDescription(notificationDetails.getDescription());
//        notification.setName(notificationDetails.getName());
//        notification.setPrice(notificationDetails.getPrice());
//        notification.setImageUrl(notificationDetails.getImageUrl());
//        notification.setStockQuantity(notificationDetails.getStockQuantity());

        notification.setMessage(notificationDetails.getMessage());
        notification.setRead(notificationDetails.isRead());
        notification.setTitle(notificationDetails.getTitle());

        return notificationRepository.save(notification);
    }

    public void deleteNotification (Integer id) {
        Notification notification = notificationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("notification not found with id: " + id));
        notificationRepository.delete(notification);
    }
}
