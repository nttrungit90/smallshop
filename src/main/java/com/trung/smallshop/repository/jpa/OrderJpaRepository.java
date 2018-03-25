package com.trung.smallshop.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trung.smallshop.domain.entity.Order;
/**
 * Repository : Order.
 */
public interface OrderJpaRepository extends JpaRepository<Order, Integer> {

}
