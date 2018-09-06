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
        words.add(new Word( "Hotel Africana",getString(R.string.africana_desc),
                "40, Airtel House, Wampewo Ave, Kampala","041 4777500",
                "http://www.hotelafricana.com", R.drawable.hotelafricana));
        words.add(new Word( "Sheraton Hotel",getString(R.string.sheraton_desc),
                "Kintu Road, Kampala","031 2309000",
                "https://www.serenahotels.com/serenakampala", R.drawable.sheraton));
        words.add(new Word( "Speke Hotel",getString(R.string.speke_desc),
                "Nile Avenue Kimathi Ave, Kampala", "041 2592214",
                "https://www.spekehotel.com", R.drawable.spekehotel));
        words.add(new Word( "Grand Imperial Hotel",getString(R.string.grand_desc),
                "Plot 2A/B/P.O.Box 7048 Colville St, Kampala","041 4311048",
                "https://www.imperialhotels.co.ug", R.drawable.grandimperial));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(wordAdapter);
        return rootView;
    }

}
