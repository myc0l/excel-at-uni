package com.excelatuni.customer_relationship_management_system.api.v1.model;

import com.excelatuni.customer_relationship_management_system.domain.Branch;
import com.excelatuni.customer_relationship_management_system.domain.ContactMethod;
import lombok.Data;

import java.util.Date;

@Data
public class CustomerDTO {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private int contact;
    private int alternateContact;
    private String address;
    private ContactMethod preferredMethod;
    private Byte[] image;
    private Date date;
    private Branch branch;

}
