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
        universities.add(new University( "Ndejje University",getString(R.string.ndu_desc),
                 "https://www.ndejjeuniversity.ac.ug", R.drawable.ndejje));
        universities.add(new University( "Makerere University", getString(R.string.muk_desc),
                "https://www.mak.ac.ug", R.drawable.muk));
        universities.add(new University( "St Lawrence University",getString(R.string.slau_desc),
                "https://www.slau.ac.ug", R.drawable.slau));
        universities.add(new University( "IUEA", getString(R.string.africana_desc),
                "www.africana.com", R.drawable.iuea));
        universities.add(new University( "Victoria Univesity",getString(R.string.victoria_desc),
                "www.africana.com", R.drawable.victoria));
        universities.add(new University( "Kyambogo University",getString(R.string.kyu_desc),
                "www.africana.com", R.drawable.kyu));


        UniversityAdapter universityAdapter = new UniversityAdapter(getActivity(), universities);
        GridView gridView = (GridView) rootView.findViewById(R.id.list);
        gridView.setAdapter(universityAdapter);

       return rootView;
    }

}
