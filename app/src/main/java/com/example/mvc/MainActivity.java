package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvc.Controller.LoginController;
import com.example.mvc.Controller.iLoginController;
import com.example.mvc.View.iLoginView;

public class MainActivity extends AppCompatActivity implements iLoginView {

    EditText email,password;
    Button login;
    iLoginController loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.OnLogin(email.getText().toString(), password.getText().toString());
            }
        });
    }

    @Override
    public void OnSuccess(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnDestroy(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}