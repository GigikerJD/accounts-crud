package com.example.accounts.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "users", schema = "usersdb")
public class UserEntity {
    @Id
    @Size(max = 200)
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Size(max = 100)
    @Column(name = "firstname", length = 100)
    private String firstname;

    @Size(max = 100)
    @Column(name = "lastname", length = 100)
    private String lastname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "DOB")
    private LocalDate dob;

    @Size(max = 100)
    @Column(name = "password", length = 100)
    private String password;

    @Size(max = 20)
    @Column(name = "role", length = 20)
    private String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}