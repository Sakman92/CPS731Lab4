package com.example.cps731lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayList<String> mTitles = new ArrayList<>();
    private ArrayList<String> mDescriptions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
    }
    private void initList(){

        mTitles.add("Title 1");
        mDescriptions.add("Desc 1");
        mTitles.add("Title 2");
        mDescriptions.add("Desc 2");
        mTitles.add("Title 3");
        mDescriptions.add("Desc 3");
        mTitles.add("Title 4");
        mDescriptions.add("Desc 4");
        mTitles.add("Title 5");
        mDescriptions.add("Desc 5");
        mTitles.add("Title 6");
        mDescriptions.add("Desc 6");

        initRecyclerView();

    }
    private void initRecyclerView(){

            RecyclerView recyclerView = findViewById(R.id.rvList);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mTitles,mDescriptions);
            recyclerView.setAdapter(adapter);

    }
}