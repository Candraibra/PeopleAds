package com.ontrucks.peopleads.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.ontrucks.peopleads.R;
import com.ontrucks.peopleads.activity.NotificationActivity;
import com.ontrucks.peopleads.activity.TransferActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private ShimmerFrameLayout mShimmerViewContainer, mShimmerViewContainer2;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mShimmerViewContainer = view.findViewById(R.id.shimmerContainer);
        mShimmerViewContainer.startShimmer();

        mShimmerViewContainer2 = view.findViewById(R.id.shimmerContainer2);
        mShimmerViewContainer2.startShimmer();

        ImageButton btnNotif = view.findViewById(R.id.btnNotif);
        btnNotif.setOnClickListener(view1 -> {
            Intent intent = new Intent(getContext(), NotificationActivity.class);
            startActivity(intent);
        });

        ImageView btnTransfer = view.findViewById(R.id.btnTransfer);
        btnTransfer.setOnClickListener(view1 -> {
            Intent intent = new Intent(getContext(), TransferActivity.class);
            startActivity(intent);
        });

    }


}
