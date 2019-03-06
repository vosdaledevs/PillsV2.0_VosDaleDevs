package com.pills;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.pills.adapters.home_adapter;
import com.pills.frags.home_frag;
import com.pills.frags.searchRecord_frag;
import com.pills.frags.search_frag;
import com.pills.frags.settings_frag;
import com.pills.models.home_model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    ArrayList<home_model> list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);


    }

    private boolean load_frag (Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.navigation_search:
                fragment = new search_frag();
                break;
            case R.id.navigation_home:
                fragment = new home_frag();

                break;
            case R.id.navigation_record:
                fragment = new searchRecord_frag();
                break;
            case R.id.navigation_settings:
                fragment = new settings_frag();
                break;
        }
        return load_frag(fragment);
    }


}
