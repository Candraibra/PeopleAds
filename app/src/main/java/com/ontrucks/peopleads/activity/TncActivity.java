package com.ontrucks.peopleads.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ontrucks.peopleads.R;
import com.ontrucks.peopleads.activity.SignupActivity2;

public class TncActivity extends AppCompatActivity {

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
