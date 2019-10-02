package com.ontrucks.peopleads.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ontrucks.peopleads.R;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView btnLogin = findViewById(R.id.btnLogIn);
        Button btnContinue = findViewById(R.id.signUp_Continue);
        btnContinue.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SignupActivity2.class);
            startActivity(intent);
            finish();

        });
        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();

        });
    }
}
