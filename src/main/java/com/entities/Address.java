package com.entities;

import java.util.Date;
import java.util.List;

@Entity()
public class Address  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;

    @Column()
    private String city;

    @Column()
    private String zipCode;

    @ManyToOne()
    List<User> user;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
}