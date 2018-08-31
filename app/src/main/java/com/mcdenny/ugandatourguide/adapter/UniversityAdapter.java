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
import com.mcdenny.ugandatourguide.model.University;
import com.mcdenny.ugandatourguide.model.Word;

import java.util.ArrayList;

public class UniversityAdapter extends ArrayAdapter<University> {

    public UniversityAdapter(@NonNull Context context, ArrayList<University> wordArrayList) {
        super(context, 0, wordArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;

        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.university_list_layout, parent, false);
        }

        University currentUniv = getItem(position);

        TextView nameTextView = (TextView) listViewItem.findViewById(R.id.univ_name);
        nameTextView.setText(currentUniv.getName());

        TextView descTextView = (TextView) listViewItem.findViewById(R.id.unive_description);
        descTextView.setText(currentUniv.getDescription());

        TextView websiteTextView = (TextView) listViewItem.findViewById(R.id.univ_website);
        websiteTextView.setText(currentUniv.getWebsite());

        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.univ_image);
        imageView.setImageResource(currentUniv.getImageResourceId());

       return listViewItem;
    }

}
