package com.ivan.skripsi.skripsi_ivan;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentPenjelasan extends Fragment {

    View view;
    public FragmentPenjelasan() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.metode_penjelasan_fragment,container,false);
        return view;
    }
}
