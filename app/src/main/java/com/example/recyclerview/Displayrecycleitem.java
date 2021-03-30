package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Displayrecycleitem extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayrecycleitem);
        txt = findViewById(R.id.textView2);
        txt.setText(getIntent().getStringExtra("fruit"));
    }
}