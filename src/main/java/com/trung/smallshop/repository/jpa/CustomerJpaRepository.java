package com.trung.smallshop.repository.jpa;

import com.trung.smallshop.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository : Customer.
 */
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

}
