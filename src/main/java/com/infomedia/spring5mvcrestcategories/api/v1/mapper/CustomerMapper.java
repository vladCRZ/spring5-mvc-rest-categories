package com.infomedia.spring5mvcrestcategories.api.v1.mapper;

import com.infomedia.spring5mvcrestcategories.api.v1.model.CustomerDTO;
import com.infomedia.spring5mvcrestcategories.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOToCustomer(CustomerDTO customerDto);
}