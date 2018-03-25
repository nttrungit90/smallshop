/*
 * Created on 24 Mar 2018 ( Time 12:23:31 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package com.trung.smallshop.service.impl;

import com.trung.smallshop.domain.dto.CustomerDto;
import com.trung.smallshop.domain.entity.Customer;
import com.trung.smallshop.repository.jpa.CustomerJpaRepository;
import com.trung.smallshop.service.CustomerService;
import com.trung.smallshop.service.mapping.CustomerServiceMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of CustomerService
 */
@Component
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Resource
	private CustomerJpaRepository customerJpaRepository;

	@Resource
	private CustomerServiceMapper customerServiceMapper;
	
	@Override
	public CustomerDto findById(Integer id) {
		Optional<Customer> optionalCustomer = customerJpaRepository.findById(id);
		return customerServiceMapper.mapCustomerToCustomerDto(optionalCustomer.get());
	}

	@Override
	public List<CustomerDto> findAll() {
		Iterable<Customer> entities = customerJpaRepository.findAll();
		List<CustomerDto> beans = new ArrayList<CustomerDto>();
		for(Customer customer : entities) {
			beans.add(customerServiceMapper.mapCustomerToCustomerDto(customer));
		}
		return beans;
	}

	@Override
	public CustomerDto save(CustomerDto customerDto) {
		return update(customerDto) ;
	}

	@Override
	public CustomerDto create(CustomerDto customerDto) {
		Optional<Customer> customerOptional = customerJpaRepository.findById(customerDto.getId());
		Customer customer = customerOptional.get();
		if( customer != null ) {
			throw new IllegalStateException("already.exists");
		}
		customer = new Customer();
		customerServiceMapper.mapCustomerDtoToCustomer(customerDto, customer);
		Customer customerSaved = customerJpaRepository.save(customer);
		return customerServiceMapper.mapCustomerToCustomerDto(customerSaved);
	}

	@Override
	public CustomerDto update(CustomerDto customerDto) {
		Optional<Customer> customerOptional = customerJpaRepository.findById(customerDto.getId());
		Customer customer = customerOptional.get();
		customerServiceMapper.mapCustomerDtoToCustomer(customerDto, customer);
		Customer customerSaved = customerJpaRepository.save(customer);
		return customerServiceMapper.mapCustomerToCustomerDto(customerSaved);
	}

	@Override
	public void delete(Integer id) {
		customerJpaRepository.deleteById(id);
	}

	public CustomerJpaRepository getCustomerJpaRepository() {
		return customerJpaRepository;
	}

	public void setCustomerJpaRepository(CustomerJpaRepository customerJpaRepository) {
		this.customerJpaRepository = customerJpaRepository;
	}

	public CustomerServiceMapper getCustomerServiceMapper() {
		return customerServiceMapper;
	}

	public void setCustomerServiceMapper(CustomerServiceMapper customerServiceMapper) {
		this.customerServiceMapper = customerServiceMapper;
	}

}
