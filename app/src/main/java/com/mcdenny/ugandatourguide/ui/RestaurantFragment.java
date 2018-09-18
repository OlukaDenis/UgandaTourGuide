package com.mcdenny.ugandatourguide.ui;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.adapter.WordAdapter;
import com.mcdenny.ugandatourguide.model.Word;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends android.support.v4.app.Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.grid_view_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( getString(R.string.cafe_name),getString(R.string.cafe_desc),
                getString(R.string.africana_address),getString(R.string.africana_tel),
                getString(R.string.africana_web), R.drawable.cafejavas));
        words.add(new Word( getString(R.string.biryani_name),getString(R.string.biryani_desc),
                getString(R.string.sheraton_address),getString(R.string.sheraton_tel),
                getString(R.string.sheraton_web), R.drawable.biryani_house));
        words.add(new Word( getString(R.string.spur_name),getString(R.string.spur_desc),
                getString(R.string.speke_address), getString(R.string.speke_tel),
                getString(R.string.speke_web), R.drawable.city_spur));
        words.add(new Word( getString(R.string.fang_name),getString(R.string.fang_desc),
                getString(R.string.grand_address),getString(R.string.grand_tel),
                getString(R.string.grand_web), R.drawable.fangfang));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(wordAdapter);

        return rootView;
    }

}
