package com.ecommerceapp.ecommerceapp.dao;

import com.ecommerceapp.ecommerceapp.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
