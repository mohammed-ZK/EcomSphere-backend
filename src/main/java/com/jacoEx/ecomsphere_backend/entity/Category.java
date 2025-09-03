package com.jacoEx.ecomsphere_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "categories")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false, unique = true)
    private String name;

//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<Product> products;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public List<Product> getProducts() {
//        return products;
//    }
}

