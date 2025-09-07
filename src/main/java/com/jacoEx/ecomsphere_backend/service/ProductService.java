package com.jacoEx.ecomsphere_backend.service;

import com.jacoEx.ecomsphere_backend.entity.Product;
import com.jacoEx.ecomsphere_backend.entity.User;
import com.jacoEx.ecomsphere_backend.repository.ProductRepository;
import com.jacoEx.ecomsphere_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product insert(Product product){
        return productRepository.save(product);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Integer id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        product.setDescription(productDetails.getDescription());
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setImageUrl(productDetails.getImageUrl());
        product.setStockQuantity(productDetails.getStockQuantity());
        product.setCategory(productDetails.getCategory());

        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found with id: " + id));
        productRepository.delete(product);
    }
}
