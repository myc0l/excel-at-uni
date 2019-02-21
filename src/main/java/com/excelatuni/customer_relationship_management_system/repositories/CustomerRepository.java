package com.excelatuni.customer_relationship_management_system.repositories;

import com.excelatuni.customer_relationship_management_system.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
