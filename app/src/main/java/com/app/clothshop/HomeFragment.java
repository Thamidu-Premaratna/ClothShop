package com.app.clothshop;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    List<HomeVerModel> homeVerModellist;
    HomeVerAdapter homeVerAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater  inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        ///Horizontal RecycleView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.baseline_house_24,"women"));
        homeHorModelList.add(new HomeHorModel(R.drawable.baseline_house_24,"women"));
        homeHorModelList.add(new HomeHorModel(R.drawable.baseline_house_24,"women"));

        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        ///vertical RecycleView
        homeHorModelList = new ArrayList<>();

        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));
        homeVerModellist.add(new HomeVerModel(R.drawable.women_1,"cloth1","5.0","25$","Green"));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModellist);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);


        return root;
    }
}