package com.trung.smallshop.repository.jpa;

import com.trung.smallshop.domain.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository : Supplier.
 */
public interface SupplierJpaRepository extends JpaRepository<Supplier, Integer> {

}
