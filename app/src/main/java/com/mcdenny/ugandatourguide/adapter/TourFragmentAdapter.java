package com.mcdenny.ugandatourguide.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.ui.HotelFragment;
import com.mcdenny.ugandatourguide.ui.RestaurantFragment;
import com.mcdenny.ugandatourguide.ui.UniversityFragment;

public class TourFragmentAdapter extends FragmentPagerAdapter {
    private Context context;
    public TourFragmentAdapter(Context context, FragmentManager fm ) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HotelFragment();
        }
        else if (position == 1){
            return new UniversityFragment();
        }
        else{
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_hotel);
        }
        else if (position == 1){
            return context.getString(R.string.category_university);
        }
        else  {
            return context.getString(R.string.category_restaurants);
        }
    }
}
