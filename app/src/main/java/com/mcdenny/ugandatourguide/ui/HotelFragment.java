package com.mcdenny.ugandatourguide.ui;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

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

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( "Hotel Africana","Hotel Africana is Uganda\'s Premier luxury Hotel. The hotel has over 14 fully furnished well air-conditioned.On a leafy property surrounded by shops and restaurants, this elegant hotel",
                "40, Airtel House, Wampewo Ave, Kampala","041 4777500", "http://www.hotelafricana.com", R.drawable.hotelafricana));
        words.add(new Word( "Sheraton Hotel","The upscale rooms and suites come with free Wi-Fi, satellite TV and safes. They also include tea and coffeemakers. Room service is available 24/7. Dining options include a gourmet restaurant, an Italian bistro and an eatery with an international menu.",
                "Kintu Road, Kampala","031 2309000", "https://www.serenahotels.com/serenakampala", R.drawable.sheraton));
        words.add(new Word( "Speke Hotel","Warmly decorated, low-key rooms offer free Wi-Fi, flat-screen TVs, and minibars, as well as tea and coffeemaking facilities. Upgraded rooms add living areas, and some have 4-poster beds.\n" +
                "Breakfast and parking are free, and a relaxed restaurant offers Indian fare.",
                "Nile Avenue Kimathi Ave, Kampala", "041 2592214", "https://www.spekehotel.com", R.drawable.spekehotel));
        words.add(new Word( "Grand Imperial Hotel","Hotel Africana is Uganda\'s Premier luxury Hotel. The hotel has over 14 fully furnished well air-conditioned",
                "Plot 2A/B/P.O.Box 7048 Colville St, Kampala","041 4311048", "https://www.imperialhotels.co.ug", R.drawable.grandimperial));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(wordAdapter);
        return rootView;
    }

}
