package com.ontrucks.peopleads;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.goodiebag.pinview.Pinview;

public class Verify_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        Pinview pinview = findViewById(R.id.verifCode);
        pinview.setPinViewEventListener((pinview1, fromUser) -> {
            if (pinview1.getValue().equals("1234")) {
                Toast.makeText(Verify_Activity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(Verify_Activity.this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
