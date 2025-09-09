package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Column(nullable = false)
    private String title;

    //    @Column(nullable = false, length = 1000)
    private String message;

    //    @Column(nullable = false)
    private boolean isRead = true;

//    public Notification (Long id , String title , String message , boolean isRead) {
//        this.id = id;
//        this.title = title;
//        this.message = message;
//        this.isRead = isRead;
//    }

    public Long getId () {
        return id;
    }

    public String getTitle () {
        return title;
    }

    public String getMessage () {
        return message;
    }

    public boolean isRead () {
        return isRead;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public void setRead (boolean read) {
        isRead = read;
    }
}
