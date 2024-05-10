package com.productManagementApp.productservice.dao.repository;

import com.productManagementApp.productservice.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
