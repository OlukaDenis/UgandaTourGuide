package com.mcdenny.ugandatourguide.ui;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.adapter.TourFragmentAdapter;
import com.mcdenny.ugandatourguide.adapter.WordAdapter;
import com.mcdenny.ugandatourguide.model.Word;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To remove the shadow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setElevation(0);
        }

        //find the viewpager that allows the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //create an adapter that knows which fragment should be shown on each page
        TourFragmentAdapter fragmentAdapter = new TourFragmentAdapter(this, getSupportFragmentManager());

        //set the adapter onto the viewpager
        viewPager.setAdapter(fragmentAdapter);

        //Give the tablayout to the viewpager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

}
