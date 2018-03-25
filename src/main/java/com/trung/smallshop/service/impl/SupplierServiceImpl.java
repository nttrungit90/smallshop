/*
 * Created on 24 Mar 2018 ( Time 12:23:31 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package com.trung.smallshop.service.impl;

import com.trung.smallshop.domain.dto.SupplierDto;
import com.trung.smallshop.domain.entity.Supplier;
import com.trung.smallshop.repository.jpa.SupplierJpaRepository;
import com.trung.smallshop.service.SupplierService;
import com.trung.smallshop.service.mapping.SupplierServiceMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of SupplierService
 */
@Component
@Transactional
public class SupplierServiceImpl implements SupplierService {

	@Resource
	private SupplierJpaRepository supplierJpaRepository;

	@Resource
	private SupplierServiceMapper supplierServiceMapper;
	
	@Override
	public SupplierDto findById(Integer id) {
		Optional<Supplier> supplierOptional = supplierJpaRepository.findById(id);
		return supplierServiceMapper.mapSupplierToSupplierDto(supplierOptional.get());
	}

	@Override
	public List<SupplierDto> findAll() {
		Iterable<Supplier> entities = supplierJpaRepository.findAll();
		List<SupplierDto> beans = new ArrayList<SupplierDto>();
		for(Supplier supplier : entities) {
			beans.add(supplierServiceMapper.mapSupplierToSupplierDto(supplier));
		}
		return beans;
	}

	@Override
	public SupplierDto save(SupplierDto supplierDto) {
		return update(supplierDto) ;
	}

	@Override
	public SupplierDto create(SupplierDto supplierDto) {
		Optional<Supplier> supplierOptional = supplierJpaRepository.findById(supplierDto.getId());
		Supplier supplier = supplierOptional.get();
		if( supplier != null ) {
			throw new IllegalStateException("already.exists");
		}
		supplier = new Supplier();
		supplierServiceMapper.mapSupplierDtoToSupplier(supplierDto, supplier);
		Supplier supplierSaved = supplierJpaRepository.save(supplier);
		return supplierServiceMapper.mapSupplierToSupplierDto(supplierSaved);
	}

	@Override
	public SupplierDto update(SupplierDto supplierDto) {
		Optional<Supplier> supplierOptional = supplierJpaRepository.findById(supplierDto.getId());
		Supplier supplier = supplierOptional.get();
		supplierServiceMapper.mapSupplierDtoToSupplier(supplierDto, supplier);
		Supplier supplierSaved = supplierJpaRepository.save(supplier);
		return supplierServiceMapper.mapSupplierToSupplierDto(supplierSaved);
	}

	@Override
	public void delete(Integer id) {
		supplierJpaRepository.deleteById(id);
	}

	public SupplierJpaRepository getSupplierJpaRepository() {
		return supplierJpaRepository;
	}

	public void setSupplierJpaRepository(SupplierJpaRepository supplierJpaRepository) {
		this.supplierJpaRepository = supplierJpaRepository;
	}

	public SupplierServiceMapper getSupplierServiceMapper() {
		return supplierServiceMapper;
	}

	public void setSupplierServiceMapper(SupplierServiceMapper supplierServiceMapper) {
		this.supplierServiceMapper = supplierServiceMapper;
	}

}