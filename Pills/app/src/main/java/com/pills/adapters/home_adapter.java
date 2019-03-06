package com.pills.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pills.R;
import com.pills.models.home_model;

import java.util.ArrayList;

public class home_adapter extends RecyclerView.Adapter<home_adapter.ViewHolderHome> {
    ArrayList<home_model> list;

    public home_adapter(ArrayList<home_model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolderHome onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_base,null, false);
        return new ViewHolderHome(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHome viewHolderHome, int i) {
        home_model model = list.get(i);
        viewHolderHome.imageView.setImageResource(list.get(i).getImageView());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolderHome extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolderHome(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.home_imageview);

        }
    }
}