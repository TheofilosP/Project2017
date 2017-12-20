package com.myproject.projectv12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessLogin extends AppCompatActivity {

        Button bRegister;
        Button etLogin;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_business_login);

            bRegister=(Button)findViewById(R.id.bRegister);
            bRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(BusinessLogin.this, Register.class);
                    startActivity(i);
                }
            });
            etLogin=(Button)findViewById(R.id.etLogin);
            etLogin.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(BusinessLogin.this, BusinessForm.class);
                    startActivity(i);
                }
            });
    }
}
