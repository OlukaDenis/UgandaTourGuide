package com.mcdenny.ugandatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.model.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, ArrayList<Word> wordList) {
        super(context, 0, wordList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;

        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.hotel_list_layout, parent, false);
        }

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listViewItem.findViewById(R.id.name);
        nameTextView.setText(currentWord.getName());

        TextView descTextView = (TextView) listViewItem.findViewById(R.id.description);
        descTextView.setText(currentWord.getDescription());

        TextView locationTextView = (TextView) listViewItem.findViewById(R.id.location);
        locationTextView.setText(currentWord.getLocation());

        TextView phoneTextView = (TextView) listViewItem.findViewById(R.id.telephone);
        phoneTextView.setText(currentWord.getPhone());

        TextView websiteTextView = (TextView) listViewItem.findViewById(R.id.website);
        websiteTextView.setText(currentWord.getWebsite());

        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.cover);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listViewItem;
    }
}
