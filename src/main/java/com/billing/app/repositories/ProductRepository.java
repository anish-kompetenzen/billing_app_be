package com.billing.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billing.app.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
