package com.saidul.crud.repository;

import com.saidul.crud.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
