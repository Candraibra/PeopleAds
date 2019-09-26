package com.ontrucks.peopleads;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        Button btnContinue = findViewById(R.id.signUp_Continue);
        btnContinue.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Verify_Activity.class);
            startActivity(intent);
            finish();

        });
    }
}
