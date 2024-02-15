package com.ecommerceapp.ecommerceapp.dao;

import com.ecommerceapp.ecommerceapp.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByProductCategoryId(@Param("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(String name, Pageable pageable);

}
