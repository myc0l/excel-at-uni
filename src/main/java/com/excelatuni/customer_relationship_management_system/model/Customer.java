package com.excelatuni.customer_relationship_management_system.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private int contact;
    private int alternateContact;
    private String address;
    private ContactMethod preferredMethod;
    private long image;
    private Date date;
    private Branch branch;

}
