package com.example.bikeClearman.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column (name = "userName", unique = true)
    private String userName;


    private String password;
    String firstname;
    String mail;


    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    List<BikeClear> bikeClears;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<BikeClear> getBikeClears() {
        return bikeClears;
    }

    public void setBikeClears(List<BikeClear> bikeClears) {
        this.bikeClears = bikeClears;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
