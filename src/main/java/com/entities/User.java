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
    private String emaiaManyToOnel;

    @Column()
    private String password;

    @OneToMany(mappedBy = "sellers")
    private List<User> sellers;

    @OneToMany(mappedBy = "buyers")
    private List<User> buyers;

    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}