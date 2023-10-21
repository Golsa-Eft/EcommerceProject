package com.bookStore.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Users")
@Table(name = "Users")
public class Users implements Serializable {
    @Id
    @Column(name = "ID", columnDefinition = "NUMBER", unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEQ",
            initialValue = 1, allocationSize = 1)
    private long userId;
    @Column(name = "email", columnDefinition = "VARCHAR2(20)")
    private String email;
    @Column(name = "password", columnDefinition = "VARCHAR2(20)")
    private String password;
    @Column(name = "fullName", columnDefinition = "VARCHAR2(20)")
    private String fullName;

    public Users() {
    }

    public Users(long userId, String email, String password, String fullName) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }

    public Users(long userId, String fullName) {
        this.userId = userId;
        this.fullName = fullName;
    }
    public Users(String password, String fullName) {
        this.password = password;
        this.fullName = fullName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(String gol123) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName(String golsa_eft) {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}