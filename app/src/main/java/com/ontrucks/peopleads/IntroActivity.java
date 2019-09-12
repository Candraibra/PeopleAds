package com.ontrucks.peopleads;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tab_indicator;
    Button btnStart;
    TextView btnNext, btnSkip;
    int position = 0;
    Animation btnAnimation;
    private ViewPager screenPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fullscreen request
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //      WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (restorePrefData()) {

            Intent mainActivity = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(mainActivity);
            finish();


        }
        setContentView(R.layout.activity_intro);

        //isi list
        String desc = getString(R.string.lorem);
        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Easy", desc, R.drawable.img1));
        mList.add(new ScreenItem("Fast", desc, R.drawable.img2));
        mList.add(new ScreenItem("Efficient", desc, R.drawable.img3));

        //inisialisasi views
        tab_indicator = findViewById(R.id.tab_indicator);
        screenPager = findViewById(R.id.screen_pager);
        btnNext = findViewById(R.id.btnNext);
        btnSkip = findViewById(R.id.btnSkip);
        btnStart = findViewById(R.id.btnStart);
        btnAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.btn_animation);
        //setup viewPager
        introViewPagerAdapter = new IntroViewPagerAdapter(this, mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //setup tab with viewpager
        tab_indicator.setupWithViewPager(screenPager);

        //next button click
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position = screenPager.getCurrentItem();

                if (position < mList.size()) {
                    position++;
                    screenPager.setCurrentItem(position);
                }
                if (position == mList.size() - 1) {
                    loadLastScreen();
                }
            }
        });
        //btn start click action
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                savePrefsData();
                finish();

            }
        });
        // skip button click action

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPager.setCurrentItem(mList.size());
            }
        });
        tab_indicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size() - 1) {
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void loadLastScreen() {
        btnNext.setVisibility(View.INVISIBLE);
        btnStart.setVisibility(View.VISIBLE);
        btnSkip.setVisibility(View.INVISIBLE);
        btnStart.setAnimation(btnAnimation);
        tab_indicator.setVisibility(View.INVISIBLE);

    }

    private void savePrefsData() {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("introOpened", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("ifIntroIsOpened", true);
        editor.apply();
    }

    private boolean restorePrefData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("introOpened", MODE_PRIVATE);
        return pref.getBoolean("ifIntroIsOpened", false);

    }

}
