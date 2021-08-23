package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvc.Controller.LoginController;
import com.example.mvc.Controller.iLoginController;
import com.example.mvc.View.iLoginView;

import org.w3c.dom.Text;

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

        loginPresenter = new LoginController(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();

                if (TextUtils.isEmpty(email1) || TextUtils.isEmpty(password1)) {
                    Toast.makeText(getApplicationContext(),"Please enter input",Toast.LENGTH_LONG).show();
                }
                else {
                    loginPresenter.OnLogin(email1, password1);
                    Log.e("1","- " + email1);
                    Log.e("1","- " + password1);
                }
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