package com.excelatuni.customer_relationship_management_system.api.v1.mapper;

import com.excelatuni.customer_relationship_management_system.api.v1.model.BranchDTO;
import com.excelatuni.customer_relationship_management_system.domain.Branch;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BranchMapper {

    BranchMapper INSTANCE = Mappers.getMapper(BranchMapper.class);
    BranchDTO branchToBranchDTO(Branch branch);
}
