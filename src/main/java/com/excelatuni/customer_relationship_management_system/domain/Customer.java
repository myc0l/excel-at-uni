package com.excelatuni.customer_relationship_management_system.domain;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private int contact;
    private int alternateContact;
    private String address;

    @Enumerated(EnumType.STRING)
    private ContactMethod preferredMethod;

    @Lob
    private Byte[] image;
    private Date date;

    @OneToOne(fetch = FetchType.EAGER)
    private Branch branch;

}
