package com.mcdenny.ugandatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.model.Parks;
import com.mcdenny.ugandatourguide.model.University;

import java.util.ArrayList;

/**
 * Created by McDenny on 9/11/2018.
 */


    public class ParkAdapter extends ArrayAdapter<Parks> {

        public ParkAdapter(@NonNull Context context, ArrayList<Parks> wordArrayList) {
            super(context, 0, wordArrayList);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {

            View listViewItem = convertView;

            if (listViewItem == null) {
                listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.park_list_layout, parent, false);
            }

            Parks currentPark = getItem(position);

            TextView nameTextView = (TextView) listViewItem.findViewById(R.id.park_name);
            nameTextView.setText(currentPark.getpName());

            TextView descTextView = (TextView) listViewItem.findViewById(R.id.park_description);
            descTextView.setText(currentPark.getpDescription());

            ImageView imageView = (ImageView) listViewItem.findViewById(R.id.park_image);
            imageView.setImageResource(currentPark.getpImageResource());

            return listViewItem;
        }

    }


