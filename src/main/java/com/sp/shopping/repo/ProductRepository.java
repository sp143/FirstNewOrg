package com.sp.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.shopping.entity.Product;

/**
 * @author Praveen Kumar.v
 * @Ojas-it
 * @since 2021-02-17
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
