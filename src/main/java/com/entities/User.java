package com.entities;
import java.util.Date;
import java.util.List;

public class User {
    @Id
    @GeneratedValue()
    private Long id;

    @Column()
    private String name;

    @Column()
    private String email;

    @Column()
    private String password;

    @OneToMany()
    private List<String> users;

    @OneToMany()
    private List<String> buyers;

    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}