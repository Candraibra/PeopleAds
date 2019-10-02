package com.ontrucks.peopleads.activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ontrucks.peopleads.R;

public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view1 -> {
            onBackPressed();
            finish();
        });
    }
}
