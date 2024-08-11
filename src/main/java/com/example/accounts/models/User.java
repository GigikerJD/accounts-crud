package com.example.accounts.models;

import java.time.LocalDate;

public class User {

    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private int age;
    private Role role;
    private LocalDate birthday;

    public User(){}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String firstname, String lastname) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User(String email, String password, String firstname, String lastname, int age) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = Role.valueOf(role.toUpperCase());
    }

    public void setBirthday(LocalDate birthday) {this.birthday = birthday;}

    public void setBirthday(int year, int month, int day) {
        this.birthday = LocalDate.of(year, month, day);
    }

    public String getEmail() {return email;}

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
