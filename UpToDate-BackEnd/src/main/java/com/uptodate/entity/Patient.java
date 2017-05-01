package com.uptodate.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "unique_id")
    private String uniqueId;

    @Column(name = "pat_email_id")
    private String email;

    @Column(name = "pat_password")
    private String password;

    @Column(name = "pat_first_name")
    private String firstName;

    @Column(name = "pat_last_name")
    private String lastName;

    @Column(name = "pat_mobile_number")
    private String telephone;

    public Patient() {
    }

    public Patient(String uniqueId, String email, String password, String lastName, String firstName, String telephone) {
        this.uniqueId = uniqueId;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.telephone = telephone;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

