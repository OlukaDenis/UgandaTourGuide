package com.mcdenny.ugandatourguide.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.adapter.WordAdapter;
import com.mcdenny.ugandatourguide.model.Word;

import java.util.ArrayList;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class HotelFragment extends android.support.v4.app.Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.grid_view_list, container, false);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word( getString(R.string.africana_name),getString(R.string.africana_desc),
                getString(R.string.africana_address),getString(R.string.africana_tel),
                getString(R.string.africana_web), R.drawable.hotelafricana));
        words.add(new Word( getString(R.string.sheraton_name),getString(R.string.sheraton_desc),
                getString(R.string.sheraton_address),getString(R.string.sheraton_tel),
                getString(R.string.sheraton_web), R.drawable.sheraton));
        words.add(new Word( getString(R.string.speke_name),getString(R.string.speke_desc),
                getString(R.string.speke_address), getString(R.string.speke_tel),
                getString(R.string.speke_web), R.drawable.spekehotel));
        words.add(new Word( getString(R.string.grand_name),getString(R.string.grand_desc),
                getString(R.string.grand_address),getString(R.string.grand_tel),
                getString(R.string.grand_web), R.drawable.grandimperial));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(wordAdapter);
        return rootView;
    }

}
