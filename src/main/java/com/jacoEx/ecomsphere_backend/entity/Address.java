package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
    private String street;

//    @Column(nullable = false)
    private String city;

//    @Column(nullable = false)
    private String state;

//    @Column(nullable = false)
    private String country;

//    @Column(nullable = false)
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

//    public Address (Long id , String street , String city , String state , String country , String postalCode , String phoneNumber , User user , LocalDateTime createdAt , LocalDateTime updatedAt) {
//        this.id = id;
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.country = country;
//        this.postalCode = postalCode;
//        this.phoneNumber = phoneNumber;
//        this.user = user;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }

    public Long getId () {
        return id;
    }

    public String getStreet () {
        return street;
    }

    public String getCity () {
        return city;
    }

    public String getState () {
        return state;
    }

    public String getCountry () {
        return country;
    }

    public String getPostalCode () {
        return postalCode;
    }

    public User getUser () {
        return user;
    }

    public LocalDateTime getCreatedAt () {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt () {
        return updatedAt;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setStreet (String street) {
        this.street = street;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public void setState (String state) {
        this.state = state;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public void setPostalCode (String postalCode) {
        this.postalCode = postalCode;
    }

    public void setUser (User user) {
        this.user = user;
    }

    public void setCreatedAt (LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt (LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

