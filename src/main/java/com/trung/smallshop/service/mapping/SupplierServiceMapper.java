/*
 * Created on 24 Mar 2018 ( Time 12:23:31 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package com.trung.smallshop.service.mapping;

import com.trung.smallshop.domain.dto.SupplierDto;
import com.trung.smallshop.domain.entity.Supplier;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class SupplierServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public SupplierServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'Supplier' to 'SupplierDto'
	 * @param supplier
	 */
	public SupplierDto mapSupplierToSupplierDto(Supplier supplier) {
		if(supplier== null) {
			return null;
		}

		//--- Generic mapping 
		SupplierDto supplierDto = map(supplier, SupplierDto.class);

		return supplierDto;
	}
	
	/**
	 * Mapping from 'SupplierDto' to 'Supplier'
	 * @param supplierDto
	 * @param supplier
	 */
	public void mapSupplierDtoToSupplier(SupplierDto supplierDto, Supplier supplier) {
		if(supplierDto == null) {
			return;
		}

		//--- Generic mapping 
		map(supplierDto, supplier);

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}