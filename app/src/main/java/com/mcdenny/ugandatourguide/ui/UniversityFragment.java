package com.mcdenny.ugandatourguide.ui;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.mcdenny.ugandatourguide.R;
import com.mcdenny.ugandatourguide.adapter.UniversityAdapter;
import com.mcdenny.ugandatourguide.model.University;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UniversityFragment extends android.support.v4.app.Fragment {


    public UniversityFragment() {
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

        ArrayList<University> universities = new ArrayList<University>();
        universities.add(new University( getString(R.string.ndu_name),getString(R.string.ndu_desc),
                 getString(R.string.ndu_web), R.drawable.ndejje));
        universities.add(new University( getString(R.string.muk_name), getString(R.string.muk_desc),
                getString(R.string.muk_web), R.drawable.muk));
        universities.add(new University( getString(R.string.slau_name),getString(R.string.slau_desc),
                getString(R.string.slau_web), R.drawable.slau));
        universities.add(new University( getString(R.string.iuea_name), getString(R.string.africana_desc),
                getString(R.string.iuea_web), R.drawable.iuea));
        universities.add(new University( getString(R.string.victoria_name),getString(R.string.victoria_desc),
                getString(R.string.victoria_web), R.drawable.victoria));
        universities.add(new University( getString(R.string.kyu_name),getString(R.string.kyu_desc),
                getString(R.string.kyu_web), R.drawable.kyu));


        UniversityAdapter universityAdapter = new UniversityAdapter(getActivity(), universities);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(universityAdapter);

       return rootView;
    }

}
