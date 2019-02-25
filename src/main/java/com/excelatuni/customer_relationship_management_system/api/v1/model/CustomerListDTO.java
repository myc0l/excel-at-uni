package com.excelatuni.customer_relationship_management_system.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CustomerListDTO {
    List<CustomerDTO> customers;
}
