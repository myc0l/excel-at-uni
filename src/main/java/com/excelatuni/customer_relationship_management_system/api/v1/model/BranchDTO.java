package com.excelatuni.customer_relationship_management_system.api.v1.model;

import lombok.Data;

@Data
public class BranchDTO {

    private Long id;
    private String name;
    private int code;
    private String city;
    private String province;
}
