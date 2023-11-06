package com.app.clothshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragmentT extends Fragment {

    public HomeFragmentT() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_t, container, false);

        Button buttonLocation1 = view.findViewById(R.id.buttonLocation1);
        Button buttonLocation2 = view.findViewById(R.id.buttonLocation2);

        buttonLocation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show location details for Location 1
                ((HomeActivityT) requireActivity()).showLocationDetails("Location 1", "Description for Location 1");
            }
        });

        buttonLocation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show location details for Location 2
                ((HomeActivityT) requireActivity()).showLocationDetails("Location 2", "Description for Location 2");
            }
        });

        return view;
    }
}
