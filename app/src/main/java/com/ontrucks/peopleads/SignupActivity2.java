package com.ontrucks.peopleads;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        TextView txtTNC = findViewById(R.id.txtTNC);
        Button btnContinue = findViewById(R.id.signUp_Continue);
        btnContinue.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Verify_Activity.class);
            startActivity(intent);
            finish();

        });
        txtTNC.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Tnc.class);
            startActivity(intent);
            finish();

        });
    }
}
