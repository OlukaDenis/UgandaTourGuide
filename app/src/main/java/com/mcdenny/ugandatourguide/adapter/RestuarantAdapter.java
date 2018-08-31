package com.mcdenny.ugandatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.model.Word;

import java.util.ArrayList;

public class RestuarantAdapter extends ArrayAdapter<Word> {
    public RestuarantAdapter(@NonNull Context context, ArrayList<Word> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View restaurantView = convertView;

        if (restaurantView == null) {
            restaurantView = LayoutInflater.from(getContext()).inflate(R.layout.hotel_list_layout, parent, false);
        }
        Word currentRestaurant = getItem(position);

        TextView nameTextView = (TextView) restaurantView.findViewById(R.id.name);
        nameTextView.setText(currentRestaurant.getName());

        TextView descTextView = (TextView) restaurantView.findViewById(R.id.description);
        descTextView.setText(currentRestaurant.getDescription());

        TextView locationTextView = (TextView) restaurantView.findViewById(R.id.location);
        locationTextView.setText(currentRestaurant.getLocation());

        TextView phoneTextView = (TextView) restaurantView.findViewById(R.id.telephone);
        phoneTextView.setText(currentRestaurant.getPhone());

        TextView websiteTextView = (TextView) restaurantView.findViewById(R.id.website);
        websiteTextView.setText(currentRestaurant.getWebsite());

        ImageView imageView = (ImageView) restaurantView.findViewById(R.id.cover);
        if (currentRestaurant.hasImage()) {
            imageView.setImageResource(currentRestaurant.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);

        }
        return restaurantView;
    }
}
