package com.example.mvc.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements iUser{
    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int isValid() {
        if(TextUtils.isEmpty(getEmail()))
            return  0;
        if(TextUtils.isEmpty(getPassword()))
            return 1;
        if (email.equals("jaytailor@gmail.com") && password.equals("jaytailor123"))
                return 2;
        else return 3;
    }
}
