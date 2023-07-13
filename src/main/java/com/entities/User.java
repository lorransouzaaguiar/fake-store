package com.entities;
import java.util.Date;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<String> users;
    private List<String> buyers;
    private Date createdAt;
    private Date updatedAt;
}