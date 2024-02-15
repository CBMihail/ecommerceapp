package com.ecommerceapp.ecommerceapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "id")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String sku;

    private String name;

    private String description;

    @Column(precision = 13, scale = 2)
    private BigDecimal unitPrice;

    private String imageUrl;

    private boolean active;

    private Integer unitsInStock;

    @org.hibernate.annotations.CreationTimestamp
    private LocalDateTime dateCreated;

    @org.hibernate.annotations.UpdateTimestamp
    private LocalDateTime lastUpdated;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;
}
