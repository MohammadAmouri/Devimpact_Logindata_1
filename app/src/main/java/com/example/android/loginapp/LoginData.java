package com.example.android.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class LoginData extends AppCompatActivity {
    private TextView tEmail;
    private TextView tPass;
    private TextView tMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logindata);

        tEmail = (TextView)findViewById(R.id.user_email_transfered);
        tPass = (TextView)findViewById(R.id.user_password_transfered);
        tMobile = (TextView) findViewById(R.id.user_mobile_transfered);

        Intent actIntent = getIntent();

        String email = actIntent.getExtras().getString(MainActivity.ENTERED_EMAIL);
        tEmail.setText(email);


        String pass = actIntent.getExtras().getString(MainActivity.ENTERED_PASSWORD);
        tPass.setText(pass);

        String mobile = actIntent.getExtras().getString(MainActivity.ENTERED_MOBILE);
        tMobile.setText(mobile);



        }
    }