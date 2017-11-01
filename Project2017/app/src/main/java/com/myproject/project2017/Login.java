package com.myproject.project2017;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.myproject.project2017.R.*;


public class Login extends AppCompatActivity {
    Button bRegister;
    Button bUserLogin;
    Button bAdminLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_login);
        bRegister=(Button)findViewById(id.bRegister);
        bUserLogin=(Button)findViewById(id.bUserLogin);
        bAdminLogin=(Button)findViewById(id.bAdminLogin);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Register.class);
                startActivity(i);
            }
        });
        bUserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, UserLogin.class);
                startActivity(i);
            }
        });
        bAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, BusinessLogin.class);
                startActivity(i);
            }
        });

        }




    }




