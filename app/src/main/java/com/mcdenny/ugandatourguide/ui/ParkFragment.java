package com.mcdenny.ugandatourguide.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.adapter.ParkAdapter;
import com.mcdenny.ugandatourguide.adapter.UniversityAdapter;
import com.mcdenny.ugandatourguide.model.Parks;
import com.mcdenny.ugandatourguide.model.University;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_view_list, container, false);

        ArrayList<Parks> parks = new ArrayList<Parks>();
        parks.add(new Parks( getString(R.string.centenary_name),getString(R.string.centenary_desc), R.drawable.centeneary));
        parks.add(new Parks( getString(R.string.crystal_name),getString(R.string.crystal_desc), R.drawable.crystal));


        ParkAdapter parkAdapter = new ParkAdapter(getActivity(), parks);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(parkAdapter);

        return rootView;
    }

}
