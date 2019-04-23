package com.example.instagram.model;

public class User {
    private String id;
    private String nama;
    private String email;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String id, String nama, String email, String pass) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.pass = pass;
    }

    private String pass;



}
