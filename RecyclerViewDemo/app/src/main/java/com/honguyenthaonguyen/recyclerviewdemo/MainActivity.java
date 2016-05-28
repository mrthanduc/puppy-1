package com.honguyenthaonguyen.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.honguyenthaonguyen.recyclerviewdemo.adapter.CategoryListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declare recycler view vars

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View binding
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_category_list);

        // Create layout manager
        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        List<String> list = new ArrayList<>();
        for(int i=1; i <=1000;i++)
        {
            list.add("Product " + i);
        }

        recyclerViewAdapter = new CategoryListAdapter(list);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
