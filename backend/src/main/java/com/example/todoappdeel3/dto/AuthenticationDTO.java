package com.example.todoappdeel3.dto;

public class AuthenticationDTO {

    public String firstname;

    public String lastname;

    public String email;
    public String password;


    public AuthenticationDTO(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

}
