package com.excelatuni.customer_relationship_management_system.repositories;

import com.excelatuni.customer_relationship_management_system.domain.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BranchRepository extends CrudRepository<Branch,Long> {
}
