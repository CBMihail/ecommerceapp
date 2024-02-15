package com.ecommerceapp.ecommerceapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id", "products"})
public class ProductCategory {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "productCategory")
    private Set<Product> products = new HashSet<>();
}
