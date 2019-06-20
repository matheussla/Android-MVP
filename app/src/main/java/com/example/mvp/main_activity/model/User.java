package com.example.mvp.main_activity.model;

public class User {

    private String Nome = "", email = "";

    public User() {
    }

    public User(String userName, String email) {
        this.Nome = userName;
        this.email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setuserName(String userName) {
        this.Nome = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email : " + email + "\nNome : " + Nome;
    }
}