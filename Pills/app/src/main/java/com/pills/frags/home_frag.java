package com.pills.frags;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pills.R;
import com.pills.adapters.home_adapter;
import com.pills.models.home_model;

import java.util.ArrayList;

public class home_frag extends Fragment {
    RecyclerView recyclerViewHome;
    ArrayList<home_model> home_list;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.home_layout, null);
        home_list = new ArrayList<>();

        recyclerViewHome = vista.findViewById(R.id.id_recycler_home);
        recyclerViewHome.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        home_adapter adapter = new home_adapter(home_data());

        recyclerViewHome.setAdapter(adapter);

        return vista;
    }
    //Base
    public ArrayList<home_model> home_data (){
        home_list.add(new home_model(R.drawable.an1));
        home_list.add(new home_model(R.drawable.kielsa));
        home_list.add(new home_model(R.drawable.kielsa1));
        home_list.add(new home_model(R.drawable.kielsa2));
        home_list.add(new home_model(R.drawable.medco));
        home_list.add(new home_model(R.drawable.medco2));
        home_list.add(new home_model(R.drawable.medco3));
        home_list.add(new home_model(R.drawable.medco4));
        return home_list;
    }
}

