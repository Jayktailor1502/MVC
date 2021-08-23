package com.example.mvc.Controller;

import com.example.mvc.Model.User;
import com.example.mvc.View.iLoginView;

public class LoginController implements iLoginController{

    iLoginView iLoginView;

    public LoginController(iLoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void OnLogin(String email, String Password) {
        User user = new User( email , Password);
        int loginCode = user.isValid();
        if (loginCode == 1)
            iLoginView.OnSuccess("Login Success");
        if (loginCode == 0)
            iLoginView.OnDestroy("Login Failed");
    }
}
