package com.trung.smallshop.repository.jpa;

import com.trung.smallshop.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository : Product.
 */
public interface ProductJpaRepository extends JpaRepository<Product, Integer> {

}
