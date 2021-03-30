package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Display {
    RecyclerView recyclerview;
    RecyclerView.LayoutManager layout;
    List<String> list;
    Recycleadapter recycleadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recycler);

        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(layout);
        recyclerview.setHasFixedSize(true);
        list = Arrays.asList(getResources().getStringArray(R.array.Cities));
        recycleadapter = new Recycleadapter(list, this);
        recyclerview.setAdapter(recycleadapter);

    }

    @Override
    public void Dispalyitem(String list) {
        Intent intent = new Intent(this, Displayrecycleitem.class);
        intent.putExtra("fruit", list);
        startActivity(intent);

    }
}