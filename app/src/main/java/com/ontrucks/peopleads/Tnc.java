package com.ontrucks.peopleads;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tnc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnc);
        Button btnAgree = findViewById(R.id.btnAgree);
        btnAgree.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SignupActivity2.class);
            startActivity(intent);
            finish();
        });
    }
}
