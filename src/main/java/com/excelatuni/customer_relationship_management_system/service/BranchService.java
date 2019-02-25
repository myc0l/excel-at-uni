package com.excelatuni.customer_relationship_management_system.service;

import com.excelatuni.customer_relationship_management_system.api.v1.model.BranchDTO;

import java.util.List;

public interface BranchService {

    List<BranchDTO> getAllBranches();
    BranchDTO getBranchByName(String name);
}
