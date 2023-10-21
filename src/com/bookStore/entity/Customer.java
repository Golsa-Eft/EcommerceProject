package com.bookStore.entity;

import java.io.Serializable;

public class Customer implements Serializable {
    private int customerId;
    private String email;
    private String fullName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /*=======Relation======*/

}
