package com.ontrucks.peopleads;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.shimmer.ShimmerFrameLayout;

public class NotificationActivity extends AppCompatActivity {
    ShimmerFrameLayout mShimmerViewContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        mShimmerViewContainer = findViewById(R.id.shimmerContainer);
        mShimmerViewContainer.startShimmer();

        mShimmerViewContainer.setOnClickListener(view1 -> {
            Intent intent = new Intent(this, DetailNotifActivity.class);
            startActivity(intent);
        });
    }
}
