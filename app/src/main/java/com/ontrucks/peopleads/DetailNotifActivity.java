package com.ontrucks.peopleads;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailNotifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_notif);
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view1 -> {
            onBackPressed();
            finish();
        });
    }
}
