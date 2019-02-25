package com.excelatuni.customer_relationship_management_system.api.v1.mapper;

import com.excelatuni.customer_relationship_management_system.api.v1.model.CustomerDTO;
import com.excelatuni.customer_relationship_management_system.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
