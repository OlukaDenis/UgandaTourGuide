package com.mcdenny.ugandatourguide.ui;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
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
        words.add(new Word( "Cafe Javas","Hotel Africana is Uganda\'s Premier luxury Hotel. The hotel has over 14 fully furnished well air-conditioned",
                "Kampala Boulevard, Kampala Road","039 2177284", "https://cafejavas.co.ug", R.drawable.cafejavas));
        words.add(new Word( "Biryani House","There is a lot of India restaurants in kampala, but we are the best in terms of Biryani. Enjoy the best food at Biryani house which specifically located in Kampala.",
                "John Babiha (Acacia) Ave, Kampala", " 0758 935839", "www.africana.com", R.drawable.biryani_house));
        words.add(new Word( "Silver City Spur","They have great cocktails and snacks.  The ambience is also good and the waiters and waitresses are very polite.",
                "Garden City Shopping Centre, Yusuf Lule Rd, Kampala","041 4563500", "https://www.spurinternational.com/Uganda", R.drawable.city_spur));
        words.add(new Word( "Fang Fang Chinese Restaurant","We have all chinese dishes that you have ever heard of. Our magnificent restaurant",
                "Plot 1, Conville Street, Kampala 6323","0773047940", "http://fangfang.co.ug", R.drawable.fangfang));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(wordAdapter);

        return rootView;
    }

}
