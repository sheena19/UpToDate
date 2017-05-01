package com.uptodate.entity;

import javax.persistence.*;

/**
 * Created by shahs on 2/26/2017.
 */
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue
    @Column(name = "doc_id")
    private String id;

    @Column(name = "doc_first_name")
    private String firstName;

    @Column(name = "doc_last_name")
    private String lastName;

    @Column(name = "doc_email_id")
    private String email;

    @Column(name = "doc_password")
    private String password;

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
