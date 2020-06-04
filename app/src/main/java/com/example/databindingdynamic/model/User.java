package com.example.databindingdynamic.model;

public class User {

    private String Name ;
    private String  detail;
    public String Namehint;
    public String detailhint;

    public User() {
    }

    public User(String namehint, String detailhint) {
       this.Namehint = namehint;
        this.detailhint = detailhint;
    }
}
